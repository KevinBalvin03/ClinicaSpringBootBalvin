package com.example.ClinicaSpringBootBalvin.repositorios;

import com.example.ClinicaSpringBootBalvin.models.TarjetaProfesional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITarjetaProfesionalRepositorio extends JpaRepository<TarjetaProfesional, Integer>{
}
