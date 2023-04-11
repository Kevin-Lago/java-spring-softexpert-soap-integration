package com.softexpert.integration.controller;

import com.softexpert.integration.model.Countries;
import com.softexpert.integration.model.Country;
import com.softexpert.integration.service.CountriesService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.io.File;
import java.util.List;

@Api("Countries")
@RestController
@RequestMapping("/api/countries")
public class CountriesController {
    @Autowired
    CountriesService service;

    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Object createCountriesIfNotExist(
            @RequestBody Countries countries
    ) {
        try {
            return new ResponseEntity<>(service.addCountriesIfNotExist(countries), HttpStatus.CREATED);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }
}
