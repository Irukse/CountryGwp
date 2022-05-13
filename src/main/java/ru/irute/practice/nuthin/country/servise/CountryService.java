package ru.irute.practice.nuthin.country.servise;


import ru.irute.practice.nuthin.country.dto.CountryDto;

import java.util.List;

public interface CountryService {
    /**
     * получить список стран Name and code
     */
    List<CountryDto> getList();
}
