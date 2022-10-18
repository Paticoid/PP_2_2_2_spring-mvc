package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao {
    private List<Car> cars ;

    {
        Car car = new Car("BMW",4,"green");
        Car carT = new Car("Audi",6,"black");
        Car carTh = new Car("KIA",5,"blue");
        Car carFo = new Car("JEEP",5,"white");
        Car carFi = new Car("Mitsubishi",9,"black");
        Car carS = new Car("MINI", 5,"green");
        cars = new ArrayList<>();
        cars.add(car);
        cars.add(carT);
        cars.add(carTh);
        cars.add(carFo);
        cars.add(carFi);
    }
    @Override
    public List <Car> getNumberCar() {
        return cars;

    }
    @Override
    public List <Car> getNumberCar(int number) {
            return cars.stream().limit(number).toList();

    }
}
