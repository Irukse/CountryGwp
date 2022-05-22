package ru.irute.practice.model;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class Business {
    String country;
    String lineBusiness;
    String yar;
    String value;
    Map<Object, Object> map = new HashMap<>();

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLineBusiness() {
        return lineBusiness;
    }

    public void setLineBusiness(String lineBusiness) {
        this.lineBusiness = lineBusiness;
    }

    public String getYar() {
        return yar;
    }

    public String setYar(String yar) {
        this.yar = yar;
        return yar;
    }

    public String getValue() {
        return value;
    }

    public String setValue(String value) {
        this.value = value;
        return value;
    }

    public Map<Object, Object> getMap() {
        return map;
    }

  //  public void setMap(Map<String, String> map) {
//        this.map = map;
 //   }

    public Business(String country, String lineBusiness, Map<Object, Object> map) {
        this.country = country;
        this.lineBusiness = lineBusiness;
        this.map = map;
    }

    public Business() { }

    public void setMap(Object s, Object s1) {
        map.put(s, s1);
    }
}
