package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    public List <Car> getNumberCar();
    public List<Car> getNumberCar(int number);
}
