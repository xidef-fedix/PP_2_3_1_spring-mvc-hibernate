package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }

    @GetMapping("/cars")
    public String printCars(Model model, @RequestParam(value = "count", required = false) Integer count) {
        if (count != null) {
            model.addAttribute("carlist", getCar(count));
        } else {
            model.addAttribute("carlist", getCar(5));
        }
        return "cars";
    }


    public List<Car> getCar(int size) {
        List<Car> carList = new ArrayList<>();
        List<Car> carList2 = new ArrayList<>();
        carList.add(new Car("Lada Kalina", 1.8, "Mokriy asfalt"));
        carList.add(new Car("Tesla Model S", 0.0, "White"));
        carList.add(new Car("Mazda RX8", 3.2, "Red"));
        carList.add(new Car("Opel Astra", 1.6, "Purple"));
        carList.add(new Car("Mersedes Benz", 5.0, "Black"));
        if (size < 5) {
            for (int i = 0; i < size; i++) {
                carList2.add(carList.get(i));
            }
            return carList2;
        } else {
            return carList;
        }
    }

}