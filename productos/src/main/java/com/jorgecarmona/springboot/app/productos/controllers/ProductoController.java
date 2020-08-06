package com.jorgecarmona.springboot.app.productos.controllers;

import com.jorgecarmona.springboot.app.productos.models.entities.Producto;
import com.jorgecarmona.springboot.app.productos.models.services.IProductoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductoController {

    @Autowired
    private IProductoServices productoServices;

    @Value("${server.port}")
    private Integer port;

    @Autowired
    private Environment env;

    @GetMapping("/listar")
    public List<Producto> listar(){
        return productoServices.findAll().stream().map(producto -> {
            //producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
            producto.setPort(port);
            return producto;
        }).collect(Collectors.toList());
    }

    @GetMapping("/ver/{id}")
    public Producto detalle(@PathVariable Long id){

        Producto producto = productoServices.findById(id);
        //producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
        producto.setPort(port);
        return producto;
    }


}
