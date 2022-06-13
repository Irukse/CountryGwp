package ru.irute.practice.servise;

import ru.irute.practice.model.Business;

import java.util.List;

public interface ServiseGwp {

    /**
     * Get a list of business lines with an average value for 2008-2015
     * @return
     */
    List<String> list(String country, List<String> business);

    /** initialize Business and add in List
     *
     * @return
     */
    List<Business> getBusiness();
}
