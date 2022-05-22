package ru.irute.practice.data;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGWP {
   public List<String> list;

    public List<String> getList() {
        return list;
    }

    public DataGWP(List<String> list) {
        this.list = list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public DataGWP() { }

    {
     String file = "src/gwpByCountry.csv";

     BufferedReader reader=null;
     String line ;

     try {
         reader = new BufferedReader(new FileReader(file));
         while ((line = reader.readLine()) != null) {
             String [] row = line.split(",");
             System.out.println(Arrays.toString(row));
                    this.list = new ArrayList();
                 for(int i =0; i<row.length; i++){
                     list.add(row[i]);
                     System.out.println(list);
                }
         }
     } catch (Exception e) {
         System.out.println("что-то пошло не так");
     }
    }

    @Override
    public String toString() {
        return "DataGWP{" +
                "list=" + list +
                '}';
    }
}
