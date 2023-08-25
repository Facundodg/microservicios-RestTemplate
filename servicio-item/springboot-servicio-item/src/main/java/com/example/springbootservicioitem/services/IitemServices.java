package com.example.springbootservicioitem.services;

import com.example.springbootservicioitem.models.Item;

import java.util.List;

public interface IitemServices {

    public List<Item> findAll();
    public Item findById(Long id, Integer cantidad);

}
