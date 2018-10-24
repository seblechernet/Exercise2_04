package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

@Autowired
CarService cars;


@RequestMapping("/")
public String index(){

    return "index";
}

@RequestMapping("/addcars")
public String addCars(Model model){

    model.addAttribute("carobject", new Car());

    return "addcars";
}
@PostMapping("/showcars")
public String showCars(@Valid @ModelAttribute("carobject") Car cartosave , BindingResult result, Model model){
     if (result.hasErrors()){
         return "addcars";
     }

     cars.add(cartosave);
     model.addAttribute("cars",cars.getCarList());
     return "showcars";
}
}
