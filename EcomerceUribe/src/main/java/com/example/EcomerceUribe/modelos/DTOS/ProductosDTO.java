package com.example.EcomerceUribe.modelos.DTOS;

import com.example.EcomerceUribe.ayudas.Categorias;

public class ProductosDTO {

    private String nombre;
    private String descripcion;
    private Categorias categoria;
    private Integer precioUnitario;
    private String marca;
    private boolean aplicaDescuento;

    public ProductosDTO() {
    }

    public ProductosDTO(String nombre, String descripcion, Categorias categoria, Integer precioUnitario, String marca, boolean aplicaDescuento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precioUnitario = precioUnitario;
        this.marca = marca;
        this.aplicaDescuento = aplicaDescuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public Integer getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Integer precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isAplicaDescuento() {
        return aplicaDescuento;
    }

    public void setAplicaDescuento(boolean aplicaDescuento) {
        this.aplicaDescuento = aplicaDescuento;
    }
}
