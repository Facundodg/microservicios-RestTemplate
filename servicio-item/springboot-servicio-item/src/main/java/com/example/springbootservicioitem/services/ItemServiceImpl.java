package com.example.springbootservicioitem.services;

import com.example.springbootservicioitem.models.Item;
import com.example.springbootservicioitem.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements IitemServices{

    @Autowired
    private RestTemplate clienteRest;

    @Override
    public List<Item> findAll() {

        List<Producto> productos = Arrays.asList(clienteRest.getForObject("http://localhost:4041/listar", Producto[].class));

        return productos.stream().map(p -> new Item(p,1)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id, Integer cantidad) {

        Map<String,String> pathVariable = new HashMap<String,String>();
        pathVariable.put("id",id.toString());

        Producto producto = clienteRest.getForObject("http://localhost:4041/listar/{id}", Producto.class, pathVariable);
        return new Item(producto,cantidad);
    }
}
