package com.example.ClinicaSpringBootBalvin.Servicios;

import com.example.ClinicaSpringBootBalvin.repositorios.IMedicoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioMedico {

    @Autowired
    private IMedicoRepositorio repositorioMedico;

}
