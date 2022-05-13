package ru.irute.practice.nuthin.country.dao;

import ru.irute.practice.nuthin.country.entity.CountryEntity;

import java.util.List;

public interface CountryDao {
    /**
     * список стран
     * @return
     */
    List<CountryEntity> all();

}
