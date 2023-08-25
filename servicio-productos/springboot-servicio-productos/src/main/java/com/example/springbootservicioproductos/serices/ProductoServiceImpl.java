package com.example.springbootservicioproductos.serices;

import com.example.springbootservicioproductos.models.Producto;
import com.example.springbootservicioproductos.repocitories.ProductosDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    private ProductosDao productosDao;

    @Override
    public List<Producto> findAll() {
        return (List<Producto>) productosDao.findAll();
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return Optional.ofNullable(productosDao.findById(id).orElse(null));
    }
}
