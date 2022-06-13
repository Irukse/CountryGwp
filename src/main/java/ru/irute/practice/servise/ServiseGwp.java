package ru.irute.practice.servise;

import ru.irute.practice.model.Business;

import java.util.List;

public interface ServiseGwp {

    /**
     * Получить список линий бизнеса с средней value за 2005-2008 гг
     * @return
     */
    List<String> list(String country, List<String> business);

    /** initialize Business and add in List
     *
     * @return
     */
    List<Business> getBusiness();
}
