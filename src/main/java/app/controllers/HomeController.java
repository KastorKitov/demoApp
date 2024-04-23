package app.controllers;

import app.models.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @ResponseBody
    @RequestMapping("/home")
    public String home(){
        return "<h1>Hello demoApp!</h1>";
    }

    @ResponseBody
    @RequestMapping("/cars")
    public ResponseEntity<List<Car>> car(){
        Car car1 = new Car("OPEL", "ASTRA", "5800");
        Car car2 = new Car("BMW", "E90", "12000");
        Car car3 = new Car("MAZDA", "6", "7800");

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        return ResponseEntity.ok(cars);

    }
}
