package com.example.springbootservicioproductos.controllers;

import com.example.springbootservicioproductos.models.Producto;
import com.example.springbootservicioproductos.serices.IProductoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
//@Controller
//@RequestMapping("/main")
public class ProductosController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/listar")
    public List<Producto> listar(){
        return productoService.findAll();
    }

    @GetMapping("/listar/{id}")
    public Optional<Producto> detalle(@PathVariable Long id ){
        return productoService.findById(id);
    }

}
