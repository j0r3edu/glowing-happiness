package com.jorgecarmona.springboot.app.productos.models.dao;

import com.jorgecarmona.springboot.app.productos.models.entities.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository <Producto,Long> {
}
