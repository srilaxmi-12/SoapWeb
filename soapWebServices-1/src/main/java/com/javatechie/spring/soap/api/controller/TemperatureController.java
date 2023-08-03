package com.javatechie.spring.soap.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javtechie.spring.soap.api.service.TemperatureConversionService;

@RestController
@RequestMapping("/temperature")
public class TemperatureController {

	
    @Autowired
    private TemperatureConversionService temperatureService;

    @GetMapping("/convert")
    public String convertTemperature(@RequestParam("celsius") String celsius) {
        return temperatureService.convertCelsiusToFahrenheit(celsius);
    }
}