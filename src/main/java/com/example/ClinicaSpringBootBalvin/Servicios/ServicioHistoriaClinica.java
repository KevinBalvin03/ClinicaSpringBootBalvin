package com.example.ClinicaSpringBootBalvin.Servicios;

import com.example.ClinicaSpringBootBalvin.repositorios.IHistoriaClinicaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioHistoriaClinica {

    @Autowired
    private IHistoriaClinicaRepositorio repositorioHistoriaClinica;

}
