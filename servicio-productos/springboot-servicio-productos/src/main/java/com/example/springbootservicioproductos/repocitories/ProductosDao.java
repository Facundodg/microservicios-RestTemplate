package com.example.springbootservicioproductos.repocitories;

import com.example.springbootservicioproductos.models.Producto;
import org.springframework.data.repository.CrudRepository;

//@Repository
public interface ProductosDao extends CrudRepository<Producto,Long> {

}
