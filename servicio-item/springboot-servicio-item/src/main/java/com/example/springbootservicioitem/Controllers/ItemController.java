package com.example.springbootservicioitem.Controllers;

import com.example.springbootservicioitem.models.Item;
import com.example.springbootservicioitem.services.IitemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private IitemServices iitemServices;
    @GetMapping("/listar")
    public List<Item> listar(){return iitemServices.findAll();}
    @GetMapping("/ver/{id}/cantidad/{cantidad}")
    public Item detalle(@PathVariable Long id,@PathVariable Integer cantidad){return iitemServices.findById(id, cantidad);}
}
