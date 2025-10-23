package com.example.EcomerceUribe.repositorios;

import com.example.EcomerceUribe.ayudas.Cargos;
import com.example.EcomerceUribe.ayudas.Sedes;
import com.example.EcomerceUribe.modelos.Empleado;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface IPedidoRepisitorio {

    Optional<Empleado> findByUsuarioCorreo(String correo);

    List<Empleado> findBySedeAndCargo(Sedes sede, Cargos cargo);

}
