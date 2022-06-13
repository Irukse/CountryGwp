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

    // дефолтная дабл
    Double d = 0.0;

    int count = 4;

    int year;
    String s = "";
    Double val;
    int counter;


    @Override
    public List<Business> getBusiness(){

        List<List<String>> myList = dataGWP.getListArrayList();
     //   List<List<Business>> businessList = new LinkedList<>();
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
         //   businessList.add(lb);
        }

        return lb;
    }

    @Override
    public List<String> list(String country, List<String> lineBusiness) {
        Business b = new Business();
        List<String> l = new LinkedList<>();
        List<Business> businessList =getBusiness();

      //  b= getBusiness();

        //     List<List<String>> myList;
        List<List<String>> myList = dataGWP.getListArrayList();
        //     List<List<String>> resultList= new ArrayList<>();
        //   List<String> myLinkedList = new LinkedList<>();
        //  int count=0;


//        for (int j = 0; j < myList.size(); j++) {
//
//            for (int i = 0; i < 15; i++) {
//                business.setCountry(dataGWP.getListArrayList().get(counter).get(0));
//                business.setLineBusiness(dataGWP.getListArrayList().get(counter).get(3));
//                String a = business.setYear(String.valueOf(year));
//                String b = business.setValue(dataGWP.getListArrayList().get(counter).get(4));
//                business.setMap(a, b);
//                    if (business.getCountry().equals(country) && year >= 2008 && year <= 2015) {
//                        if (business.getLineBusiness().equals(lineBusiness.get(j))) {
//                            s = String.valueOf(business.getMap().get(a));
//                            val = Double.valueOf(s);
//                            d += val;
//                            val = 0.0;
//                        }
//                    }
//
//                    year++;
//
//
//            }
//            l.add(business.getLineBusiness());
//            l.add(String.valueOf(d));
//          //  resultList.add(counter, l);
//        }
   //       for (int j = 0; j < myList.size(); j++) {//

        for (int i = 0; i < lineBusiness.size(); i++) {
          //  int year= Integer.parseInt(b.getYear());
            year=2000;
               for(int j =0; j < myList.get(i).size()-4; j++){
                 b= businessList.get(i);

                   if (!b.getCountry().equals(country)) {
                       System.out.println("country incorrect!");
                   }
                   if (b.getCountry().equals(country)
                           && b.getLineBusiness().equals(lineBusiness.get(i))
                     //      && b.getMap().get(year).equals(year)
                        ) {
                       if ( year >= 2008 && year <= 2015) {
                        //   b.getMap().get(year);

                           s = String.valueOf(year);
                           val = Double.valueOf(String.valueOf(b.getMap().get(s)));
                           d += val;
                           val = 0.0;
                       }
                       year++;
                   }
               }




        }
        l.add(business.getLineBusiness());
        l.add(String.valueOf(d));
        //  resultList.add(counter, l);
 //   }

    //    counter++;

        return l;
    }
}


