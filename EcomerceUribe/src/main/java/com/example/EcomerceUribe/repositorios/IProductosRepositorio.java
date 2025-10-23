package com.example.EcomerceUribe.repositorios;

import com.example.EcomerceUribe.ayudas.Categorias;
import com.example.EcomerceUribe.modelos.Producto;

import java.util.List;

public interface IProductosRepositorio {
    List<Producto> findByCategoriaAndMarca(Categorias categoria, String marca);
}
