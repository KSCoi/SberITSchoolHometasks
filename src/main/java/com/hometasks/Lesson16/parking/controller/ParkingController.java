package com.hometasks.Lesson16.parking.controller;

//Есть парковка на 20 мест.
//        Необходимо реализовать методы:
//        /park (POST-запрос) - припарковать машину на любое свободное место
//        /unpark (POST-запрос) - убрать с парковки машину на определенном парковочном месте
//        /free (GET-запрос) - показать список свободных парковочных мест

import com.hometasks.Lesson16.parking.dao.ParkingDAO;
import com.hometasks.Lesson16.parking.models.Car;
import org.springframework.web.bind.annotation.*;


import java.util.Map;

@RestController
public class ParkingController {
    private ParkingDAO parkingDAO;

    public ParkingController(ParkingDAO parkingDAO) {
        this.parkingDAO = parkingDAO;
    }

    @GetMapping("/free")
    public Map<Integer, Car> getParkingMap()     {
        return parkingDAO.index();
    }

    @PostMapping("/park")
    public String parkCarWithNameAndIdOnSpace(@RequestBody Car car) {
        if(car.getName() == null)
            return "Car can not be parked";

        boolean isParked = parkingDAO.parkCarOnRandomPlace(car);
        if(isParked)
            return "Car is parked!";
        else return "Car can not be parked";
    }

    @PostMapping("/unpark")
    public String unparkCarOnSpace(@RequestBody Car car) {
        boolean isUnparked = parkingDAO.unparkCar(car);
        if(isUnparked)
            return "Car is unparked";
        else return "This space is empty";
    }

}

