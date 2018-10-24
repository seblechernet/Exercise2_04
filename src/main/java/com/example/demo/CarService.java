package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CarService {
private ArrayList<Car> carList;

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }

    public CarService() {
         carList=new ArrayList<>();
    }
    public void add(Car aCar){
        carList.add(aCar);

    }
}
