package com.example.EcomerceUribe.repositorios;

import com.example.EcomerceUribe.ayudas.Sedes;
import com.example.EcomerceUribe.modelos.Empleado;

import java.util.List;

public interface IEmpleadoRepositorio {

    List<Empleado> findBySede(Sedes sede);

    List<Empleado> findByCargo(String cargo);
}


