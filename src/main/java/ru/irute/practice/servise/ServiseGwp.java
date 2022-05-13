package ru.irute.practice.servise;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.irute.practice.model.Business;
@Service
public class ServiseGwp {
    private  final Business business;

    @Autowired
    public ServiseGwp(Business business) {
        this.business = business;
    }


}
