package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List <Car> getNumberCar();
    public List<Car> getNumberCar(int number);
}
