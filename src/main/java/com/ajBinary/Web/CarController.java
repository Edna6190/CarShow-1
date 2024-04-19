package com.ajBinary.Web;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajBinary.entity.Car;
import com.ajBinary.reository.CarRepository;

@RestController
@RequestMapping("/car")
public class CarController{
	
@Autowired
private CarRepository repository;

@GetMapping
public List<Car> getCars(){
    return repository.findAll();

}
}