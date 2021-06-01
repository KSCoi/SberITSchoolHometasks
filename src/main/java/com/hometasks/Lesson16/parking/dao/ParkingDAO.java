package com.hometasks.Lesson16.parking.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hometasks.Lesson16.parking.models.Car;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class ParkingDAO {
    private Map<Integer, Car> parkingList;
    {
        parkingList = new LinkedHashMap<>(20);
        for (int i = 0; i < 20; i++) {
            parkingList.put(i+1,null);
        }
        parkingList.put(1, new Car("Lada"));
        parkingList.put(2, new Car("Volvo"));
        parkingList.put(3, new Car("BMW"));
    }
    public Map<Integer, Car> index()    {
        return parkingList;
    }

    public boolean parkCarOnRandomPlace(Car car)    {
        if(!parkingList.containsValue(null)){
            return false;
        }
        for(Map.Entry<Integer, Car> entry : parkingList.entrySet()) {
            if(entry.getValue()==null){
                parkingList.put(entry.getKey(),car);
                break;
            }
        }
        return true;
    }
    @JsonProperty("place")
    public boolean unparkCar(Car car) {
      for (Map.Entry<Integer, Car> entry : parkingList.entrySet())  {
            if(entry.getValue().getName().equals(car.getName()))    {
                parkingList.put(entry.getKey(),null);
                return true;
          }
      }
          return false;
    }
    public Car getCarFromList(Car car)  {
       for(Map.Entry entry:parkingList.entrySet())  {
           if(car.equals(entry.getValue()))
               return (Car)entry.getValue();
       }
       return null;
    }
}
