package ru.irute.practice.servise;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.irute.practice.data.DataGWP;
import ru.irute.practice.model.Business;

import java.util.LinkedList;
import java.util.List;

@Service
public class ServiseGwpImpl implements ServiseGwp {

    private final DataGWP dataGWP;

    @Autowired
    public ServiseGwpImpl(DataGWP dataGWP) {
        this.dataGWP = dataGWP;
    }

    Double d = 0.0;
    int year;
    String s = "";
    Double val;
    int counter;
    int count=0;

    @Override
    public List<Business> getBusiness(){

        List<List<String>> myList = dataGWP.getListArrayList();
        List<Business> lb= new LinkedList<>();
        for (int i = 0; i < myList.size(); i++) {
            Business business = new Business();
            business.setCountry(dataGWP.getListArrayList().get(i).get(0));
            business.setLineBusiness(dataGWP.getListArrayList().get(i).get(3));
            counter=4;
            year=2000;
            for(int j = 0; j < myList.get(i).size()-4; j++){
                String a = business.setYear(String.valueOf(year));
                String b = business.setValue(dataGWP.getListArrayList().get(i).get(counter));
                business.setMap(a, b);
                year++;
                counter++;

            }
            lb.add(business);
        }
        return lb;
    }

    @Override
    public List<String> list(String country, List<String> lineBusiness) {
        Business b;
        List<String> l = new LinkedList<>();
        List<Business> businessList =getBusiness();
        List<List<String>> myList = dataGWP.getListArrayList();

        for (int i = 0; i < myList.size(); i++) {
            b= businessList.get(i);
            year=2000;
            d=0.0;
            if (b.getCountry().equals(country))
            {
                for (String list:lineBusiness) {
                    if(b.getLineBusiness().equals(list)){
                        for(int j =0; j < myList.get(i).size()-4; j++){
                            if ( year >= 2008 && year <= 2015) {
                                s = String.valueOf(year);
                                val = Double.valueOf(String.valueOf(b.getMap().get(s)));
                                d += val;
                                val = 0.0;
                            }
                            year++;
                            count++;
                        }


                        l.add(b.getLineBusiness());
                        l.add(String.valueOf(d));
                    }

                }

               }
        }
        return l;
    }
}


