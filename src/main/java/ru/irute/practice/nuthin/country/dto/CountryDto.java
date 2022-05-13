package ru.irute.practice.nuthin.country.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountryDto {
    private Long id;

    /**
     * имя страны
     */
    @Size(max = 45)
    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
