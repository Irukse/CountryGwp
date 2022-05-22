package ru.irute.practice.servise;

import java.util.List;

public interface ServiseGwp {

    /**
     * Получить список линий бизнеса с средней value за 2005-2008 гг
     * @return
     */
    List<String> list(String country, List<String> business);
}
