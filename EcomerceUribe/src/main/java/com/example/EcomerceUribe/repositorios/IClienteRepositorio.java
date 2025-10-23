package com.example.EcomerceUribe.repositorios;

import com.example.EcomerceUribe.ayudas.Departamentos;
import com.example.EcomerceUribe.modelos.Cliente;

import java.util.List;

public interface IClienteRepositorio {

    List<Cliente> findByDepartamento(Departamentos departamento);
    List<Cliente> findByCiudad(String ciudad);

}
