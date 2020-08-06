package com.jorgecarmona.springboot.app.productos.models.services;

import com.jorgecarmona.springboot.app.productos.models.entities.Producto;

import java.util.List;

public interface IProductoServices {

    public List<Producto> findAll();

    public Producto findById(Long id);



}
