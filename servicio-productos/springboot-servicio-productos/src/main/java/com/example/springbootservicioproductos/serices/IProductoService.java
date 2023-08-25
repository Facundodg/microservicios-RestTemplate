package com.example.springbootservicioproductos.serices;

import com.example.springbootservicioproductos.models.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {

    public List<Producto> findAll();
    public Optional<Producto> findById(Long id);

}
