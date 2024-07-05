package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("KIA Cee'd", "gray", 129));
        cars.add(new Car("BMV X5", "black", 290));
        cars.add(new Car("Tesla Plaid", "white", 1000));
        cars.add(new Car("AUDI Q8", "blue", 480));
        cars.add(new Car("Porsche Cayman", "green", 500));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
