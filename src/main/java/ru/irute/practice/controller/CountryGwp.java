package ru.irute.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.irute.practice.data.DataGWP;
import ru.irute.practice.model.BusinessData;
import ru.irute.practice.servise.ServiseGwpImpl;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/", produces = APPLICATION_JSON_VALUE)
public class CountryGwp { private final DataGWP dataGWP;
private final ServiseGwpImpl serviseGwp;
    @Autowired
    public CountryGwp(DataGWP dataGWP, ServiseGwpImpl serviseGwp) {
        this.dataGWP = dataGWP;
        this.serviseGwp = serviseGwp;
    }

    @PostMapping("/list")
    public List<String> getList(@RequestBody BusinessData data){
        return serviseGwp.list( data.getCount(), data.getLineBusiness());


    }

}

