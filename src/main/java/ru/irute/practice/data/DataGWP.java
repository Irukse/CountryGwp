package ru.irute.practice.data;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataGWP {

    List<List<String>> listArrayList =new ArrayList<>();

    public List<List<String>> getListArrayList() {
        return listArrayList;
    }

    public void setListArrayList(List<List<String>> listArrayList) {

        this.listArrayList = listArrayList;
    }

    int count;

    public DataGWP() { }

    {
        String file = "src/gwpByCountry.csv";

        BufferedReader reader=null;
        String line;
        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String [] row = line.split(",");
                count=0;
                List<String> list= new ArrayList();
                for (int i = 0; i < row.length; i++) {
                       list.add(row[i]);
                }
                listArrayList.add(count, list);
                count++;
            }
            listArrayList.remove(listArrayList.size()-1);
        } catch (Exception e) {
            System.out.println("что-то пошло не так");
        }
        System.out.println(listArrayList);
    }

}
