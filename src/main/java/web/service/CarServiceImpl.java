package web.service;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarServiceImpl implements CarService {


    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car("Лада", "Кайора", 1997));
            carList.add(new Car("Волга", "3000", 2000));
            carList.add(new Car("Феррари", "Спорт", 2019));
            carList.add(new Car("BMW", "Supreme", 2007));
            carList.add(new Car("ЗиЛ", "АКПМ", 1980));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}