package com.javatechie.spring.soap.api.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.soap.api.NumberToWords.NumberToWordsResponse;

import NumberConversionService.NumberConversionService;

@RestController
@RequestMapping("/number")
public class NumberController {

	
    @Autowired
    private NumberConversionService numberService;

    @GetMapping("/convertToWords")
    public String convertNumberToWords(@RequestParam("number") BigInteger number) {
        return numberService.convertNumberToWords(number);
    }
}
