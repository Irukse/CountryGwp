package ru.irute.practice.model;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BusinessData {
    private String count;
    private List<String> lineBusiness;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<String> getLineBusiness() {
        return lineBusiness;
    }

    public void setLineBusiness(List<String> lineBusiness) {
        this.lineBusiness = lineBusiness;
    }

    public BusinessData() {

    }
}
