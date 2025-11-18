package com.example.ClinicaSpringBootBalvin.Servicios;

import com.example.ClinicaSpringBootBalvin.repositorios.IPacienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPaciente {

    @Autowired
    private IPacienteRepositorio repositorioPaciente;

}
