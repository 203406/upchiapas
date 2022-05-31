package com.example.upchiapas.controller;


import com.example.upchiapas.entity.Fruta;
import com.example.upchiapas.service.FrutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class FrutaController {

    @Autowired
    FrutaService frutaService;

    @GetMapping (value="/fruta")
    public List<Fruta> findAll(){
        return frutaService.findAll();
    }
}
