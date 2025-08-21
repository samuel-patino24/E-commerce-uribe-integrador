package com.example.EcomerceUribe.modelos;

import com.example.EcomerceUribe.ayudas.EstadosUsuario;
import com.example.EcomerceUribe.ayudas.TipoDocumento;

import java.time.LocalDate;

public class Usuario {


    private Integer id;
    private String nombres;
    private String correo;
    private String contarseña;
    private EstadosUsuario estado;
    private LocalDate fechaNacimiento;
    private TipoDocumento tipoDocumento;
    private String documento;
}
