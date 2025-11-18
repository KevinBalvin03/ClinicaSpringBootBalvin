package com.example.ClinicaSpringBootBalvin.Servicios;

import com.example.ClinicaSpringBootBalvin.repositorios.ITarjetaProfesionalRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioTarjetaProfesional {

    @Autowired
    private ITarjetaProfesionalRepositorio repositorioTarjetaProfesional;

}
