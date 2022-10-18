package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService {
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getNumberCar() {
        return carDao.getNumberCar();
    }

    @Override
    public List<Car> getNumberCar(int number) {
        return carDao.getNumberCar(number);
    }
}
