package ru.irute.practice.servise;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.irute.practice.data.DataGWP;
import ru.irute.practice.model.Business;

import java.util.LinkedList;
import java.util.List;

@Service
public class ServiseGwpImpl implements ServiseGwp {
    private final Business business;
    private final DataGWP dataGWP;


    @Autowired
    public ServiseGwpImpl(Business business, DataGWP dataGWP) {
        this.business = business;
        this.dataGWP = dataGWP;
    }

    Double d = 0.0;
    int count = 4;
    int year = 2000;
    String s = "";
    Double val;

    @Override
    public List<String> list(String country, List<String> lineBusiness) {

        List<String> l = new LinkedList<>();
        List<String> stream = dataGWP.list;

            for (int j = 0; j < lineBusiness.size(); j++) {
                for (int i = 0; i < stream.size()-4; i++) {
                    business.setCountry(stream.get(0));
                    business.setLineBusiness(stream.get(3));
                    String a = business.setYar(String.valueOf(year));
                    String b = business.setValue(stream.get(count));
                    business.setMap(a, b);

                    if (business.getCountry().equals(country) && year>=2008 && year>=2015) {
                        if (business.getLineBusiness().equals(lineBusiness.get(j))) {
                            s = String.valueOf(business.getMap().get(a));
                            val = Double.valueOf(s);
                            d += val;
                            val = 0.0;
                        }
                    }
                   count++;
                   year++;


                }

            }
            l.add(business.getLineBusiness());
            l.add(String.valueOf(d));

        return l;
    }
}


