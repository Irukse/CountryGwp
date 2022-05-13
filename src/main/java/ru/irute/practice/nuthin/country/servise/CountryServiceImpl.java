package ru.irute.practice.nuthin.country.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.irute.practice.nuthin.country.Mapper.ObjectMapperUtils;
import ru.irute.practice.nuthin.country.dao.CountryDao;
import ru.irute.practice.nuthin.country.dto.CountryDto;
import ru.irute.practice.nuthin.country.entity.CountryEntity;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    private final CountryDao countryDao;


    @Autowired
    public CountryServiceImpl(CountryDao countryDao) {
        this.countryDao = countryDao;

    }

    @Override
    public List<CountryDto> getList() {
        List<CountryEntity> list  = countryDao.all();
        return ObjectMapperUtils.mapAll(list, CountryDto.class);
    }
}


