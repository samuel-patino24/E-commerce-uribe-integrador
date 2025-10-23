package com.example.EcomerceUribe.modelos;

import com.example.EcomerceUribe.ayudas.Categorias;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name="productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "fotografia")
    private String fotografia;

    @Column(name = "descripcion", length = 300)
    private String descripcion;

    @Enumerated(EnumType.STRING)
    @Column(name = "categoria", nullable = false, length = 50)
    private Categorias categoria;

    @Column(name = "precio_unitario", nullable = false)
    private Integer precioUnitario;

    @Column(name = "marca", length = 30)
    private String marca;

    @Column(name = "aplica_descuento", nullable = false)
    private boolean aplicaDescuento;
    @ManyToOne
    @JoinColumn(name = "fk_pedido", referencedColumnName = "id")
    @JsonBackReference(value = "relacionpedidoproducto")
    private Pedido pedido;

    public Producto() {
    }

    public Producto(Long id, String nombre, String fotografia, String descripcion, Categorias categoria, Integer precioUnitario, String marca, boolean aplicaDescuento, Pedido pedido) {
        this.id = id;
        this.nombre = nombre;
        this.fotografia = fotografia;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precioUnitario = precioUnitario;
        this.marca = marca;
        this.aplicaDescuento = aplicaDescuento;
        this.pedido = pedido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
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

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
