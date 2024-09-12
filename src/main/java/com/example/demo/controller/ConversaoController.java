package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversaoController {

    // Método para converter Celsius para Fahrenheit
    @GetMapping("/celsiusParaFahrenheit")
    public String celsiusParaFahrenheit(@RequestParam double grau) {
        double fahrenheit = (grau * 9/5) + 32;
        return grau + "ºC é igual a " + fahrenheit + "ºF.";
    }

    // Método para converter Fahrenheit para Celsius
    @GetMapping("/fahrenheitParaCelsius")
    public String fahrenheitParaCelsius(@RequestParam double grau) {
        double celsius = (grau - 32) * 5/9;
        return grau + "ºF é igual a " + celsius + "ºC.";
    }
}
