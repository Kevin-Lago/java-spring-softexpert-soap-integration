package com.softexpert.integration.service;

import com.softexpert.integration.client.FormsClient;
import com.softexpert.integration.model.Countries;
import com.softexpert.integration.model.Country;
import com.softexpert.integration.model.StatesOrProvinces;
import com.softexpert.integration.wsdl.forms.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CountriesService {
    @Autowired
    FormsClient formsClient;

    public Object addCountriesIfNotExist(Countries countries) {
        Map<String, Country> existingCountries = getExistingCountries(1, null).getCountries().stream().collect(Collectors.toMap(Country::getIso3166Alpha2, country -> country));
        List<Country> filteredCountries = countries.getCountries().stream().filter(country -> {
            if (existingCountries.get(country.getIso3166Alpha2()) != null) return false;
            else return true;
        }).collect(Collectors.toList());

        countries.setCountries(filteredCountries);
        addCountries(countries);
        return filteredCountries;
    }

    public Countries getExistingCountries(Integer page, Countries countries) {
        if (countries == null) countries = new Countries();
        GetTableRecordRequestType getTableRecordRequestType = new GetTableRecordRequestType();
        getTableRecordRequestType.setTableID("countries");
        getTableRecordRequestType.setPagination(new BigInteger(page.toString()));

        GetTableRecordResponseType getTableRecordResponseType = formsClient.getTableRecords(getTableRecordRequestType);

        List<Country> existingCountries = getTableRecordResponseType.getRecordList().getRecord().stream().map(record -> {
            Map<String, String> fields = record.getFieldList().get(0).getTableField().stream()
                    .collect(Collectors.toMap(FieldData::getTableFieldID, FieldData::getTableFieldValue));

            Country country = new Country();
            country.setName(fields.get("ENGLISHNAME"));
            country.setIso3166Alpha2(fields.get("ISO3166ALPHA2"));
            country.setIso3166Alpha3(fields.get("ISO3166ALPHA3"));
            country.setIso3166Numeric(fields.get("ISO3166NUMERIC"));
            return country;
        }).collect(Collectors.toList());

        if (page < Integer.parseInt(getTableRecordResponseType.getTotalPagination())) {
            page += 1;
            getExistingCountries(page, countries);
        }

        countries.setCountries(existingCountries);
        return countries;
    }

    public void addCountries(Countries countries) {
        FormRecordList formRecordList = new FormRecordList();
        NewTableRecordListRequestType newTableRecordListRequestType = new NewTableRecordListRequestType();
        newTableRecordListRequestType.setTableID("countries");
        newTableRecordListRequestType.setUserID("");

        countries.getCountries().forEach(country -> {
            TbRecord tbRecord = new TbRecord();
            TableFieldArray tableFieldArray = new TableFieldArray();

            FieldData englishName = new FieldData();
            englishName.setTableFieldID("englishname");
            englishName.setTableFieldValue(country.getName());
            tableFieldArray.addTableField(englishName);

            FieldData iso3166Alpha2 = new FieldData();
            iso3166Alpha2.setTableFieldID("iso3166alpha2");
            iso3166Alpha2.setTableFieldValue(country.getIso3166Alpha2());
            tableFieldArray.addTableField(iso3166Alpha2);

            FieldData iso3166Alpha3 = new FieldData();
            iso3166Alpha3.setTableFieldID("iso3166Alpha3");
            iso3166Alpha3.setTableFieldValue(country.getIso3166Alpha3());
            tableFieldArray.addTableField(iso3166Alpha3);

            FieldData iso3166Numeric = new FieldData();
            iso3166Numeric.setTableFieldID("iso3166numeric");
            iso3166Numeric.setTableFieldValue(country.getIso3166Numeric());
            tableFieldArray.addTableField(iso3166Numeric);

            tbRecord.setTableFieldList(tableFieldArray);
            formRecordList.addRecord(tbRecord);
        });

        newTableRecordListRequestType.setFormRecordList(formRecordList);
        formsClient.newTableRecordList(newTableRecordListRequestType);
    }

//    public Object addStatesOrProvincesIfNotExist(StatesOrProvinces statesOrProvinces) {
//
//    }
//
//    public StatesOrProvinces getExistingStatesOrProvinces(Integer page, StatesOrProvinces statesOrProvinces) {
//
//    }
//
//    public StatesOrProvinces addStatesOrProvinces(StatesOrProvinces statesOrProvinces) {
//
//    }
}
