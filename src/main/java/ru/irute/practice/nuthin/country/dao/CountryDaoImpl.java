package ru.irute.practice.nuthin.country.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.irute.practice.nuthin.country.entity.CountryEntity;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CountryDaoImpl implements CountryDao{

    private final EntityManager em;

    @Autowired
    public CountryDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<CountryEntity> all() {
        TypedQuery<CountryEntity> query = em.createQuery("SELECT c FROM Country c", CountryEntity.class);
        return query.getResultList();
    }


}
