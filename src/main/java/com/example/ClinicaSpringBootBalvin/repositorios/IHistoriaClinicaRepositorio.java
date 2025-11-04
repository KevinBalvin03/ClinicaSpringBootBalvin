package com.example.ClinicaSpringBootBalvin.repositorios;

import com.example.ClinicaSpringBootBalvin.models.HistoriaClinica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHistoriaClinicaRepositorio extends JpaRepository<HistoriaClinica, Integer> {

}
