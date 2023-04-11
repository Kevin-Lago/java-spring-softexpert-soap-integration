package com.softexpert.integration.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "country")
public class Country {
    @JsonProperty("name")
    @JsonAlias({"name"})
    @XmlElement(name = "name")
    private String name;
    @JsonProperty("iso3166Alpha2")
    @JsonAlias({"alpha-2"})
    @XmlElement(name = "iso3166Alpha2")
    private String iso3166Alpha2;
    @JsonProperty("iso3166Alpha3")
    @JsonAlias({"alpha-3"})
    @XmlElement(name = "iso3166Alpha3")
    private String iso3166Alpha3;
    @JsonProperty("iso3166Numeric")
    @JsonAlias({"numeric", "country-code"})
    @XmlElement(name = "iso3166Numeric")
    private String iso3166Numeric;
    @JsonProperty("region")
    @JsonAlias({"region"})
    @XmlElement(name = "region")
    private String region;
    @JsonProperty("subRegion")
    @JsonAlias({"sub-region"})
    @XmlElement(name = "subRegion")
    private String subRegion;
    @JsonProperty("intermediateRegion")
    @JsonAlias({"intermediate-region"})
    @XmlElement(name = "intermediateRegion")
    private String intermediateRegion;
    @JsonProperty("regionCode")
    @JsonAlias({"region-code"})
    @XmlElement(name = "regionCode")
    private String regionCode;
    @JsonProperty("subRegionCode")
    @JsonAlias({"sub-region-code"})
    @XmlElement(name = "subRegionCode")
    private String subRegionCode;
    @JsonProperty("intermediateRegionCode")
    @JsonAlias({"intermediate-region-code"})
    @XmlElement(name = "intermediateRegionCode")
    private String intermediateRegionCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIso3166Alpha2() {
        return iso3166Alpha2;
    }

    public void setIso3166Alpha2(String iso3166Alpha2) {
        this.iso3166Alpha2 = iso3166Alpha2;
    }

    public String getIso3166Alpha3() {
        return iso3166Alpha3;
    }

    public void setIso3166Alpha3(String iso3166Alpha3) {
        this.iso3166Alpha3 = iso3166Alpha3;
    }

    public String getIso3166Numeric() {
        return iso3166Numeric;
    }

    public void setIso3166Numeric(String iso3166Numeric) {
        this.iso3166Numeric = iso3166Numeric;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubRegion() {
        return subRegion;
    }

    public void setSubRegion(String subRegion) {
        this.subRegion = subRegion;
    }

    public String getIntermediateRegion() {
        return intermediateRegion;
    }

    public void setIntermediateRegion(String intermediateRegion) {
        this.intermediateRegion = intermediateRegion;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getSubRegionCode() {
        return subRegionCode;
    }

    public void setSubRegionCode(String subRegionCode) {
        this.subRegionCode = subRegionCode;
    }

    public String getIntermediateRegionCode() {
        return intermediateRegionCode;
    }

    public void setIntermediateRegionCode(String intermediateRegionCode) {
        this.intermediateRegionCode = intermediateRegionCode;
    }
}
