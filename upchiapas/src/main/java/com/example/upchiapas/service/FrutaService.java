package com.example.upchiapas.service;

import com.example.upchiapas.dao.IFrutaRepository;
import com.example.upchiapas.entity.Fruta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrutaService {

    @Autowired
    private IFrutaRepository dao;

    public List<Fruta> findAll(){
        return dao.findAll();
    }


}
