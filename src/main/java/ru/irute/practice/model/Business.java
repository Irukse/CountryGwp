package ru.irute.practice.model;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.Entity;
import java.util.Map;
@Component
public class Business {
    String country;
    String lineBusiness;
    String yar;
    double value;
    Map<String, Double> map;

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

    public void setYar(String yar) {
        this.yar = yar;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Map<String, Double> getMap() {
        return map;
    }

    public void setMap(Map<String, Double> map) {
        this.map = map;
    }

    public Business(String country, String lineBusiness) {
        this.country = country;
        this.lineBusiness = lineBusiness;
    }

    public Business() { }
}
