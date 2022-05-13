package ru.irute.practice.nuthin.country.entity;

import javax.persistence.*;

@Entity(name = "Country")
public class CountryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     *название страны
     */
    @Column(name = "name_country", length = 25,nullable = false)
    private String name;

    /**
     * служебное поле hibernate
     */
    @Version
    private Integer version;


    public CountryEntity() {

    }
    /**
     *геттеры и сеттеры
     */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
