package ru.irute.practice;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@EnableSwagger2

@SpringBootApplication
public class Application {
@Bean
    ModelMapper modelMapper(){
    return new ModelMapper();
}
    public static void main(String[] args) {
        SpringApplication.run(ru.irute.practice.Application.class, args);

    }

}