package com.example.EcomerceUribe.modelos.DTOS;

public class ClientesDTO {

    private String direccion;
    private Double calificacion;
    private String referenciaPago;

    public ClientesDTO() {
    }


    public ClientesDTO(String direccion, Double calificacion, String referenciaPago) {
        this.direccion = direccion;
        this.calificacion = calificacion;
        this.referenciaPago = referenciaPago;
    }

    public String getReferenciaPago() {
        return referenciaPago;
    }

    public void setReferenciaPago(String referenciaPago) {
        this.referenciaPago = referenciaPago;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
