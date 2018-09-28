package com.codecentric.hystrix.warstories.shared.dto;

import com.codecentric.hystrix.warstories.shared.enums.AdressType;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Benjamin Wilms (xd98870)
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdressDTO {

    public AdressType adressType;

    public String country;

    public String city;

    public String street;

    public String postcode;

    public String name;

    public AdressType getAdressType() {
        return adressType;
    }

    public void setAdressType(AdressType adressType) {
        this.adressType = adressType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("AdressDTO{");
        sb.append("adressType=").append(adressType);
        sb.append(", country='").append(country).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", street='").append(street).append('\'');
        sb.append(", postcode='").append(postcode).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
