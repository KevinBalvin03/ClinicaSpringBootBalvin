package com.example.ClinicaSpringBootBalvin.repositorios;

import com.example.ClinicaSpringBootBalvin.models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepositorio extends JpaRepository<Paciente, Integer>{




}
