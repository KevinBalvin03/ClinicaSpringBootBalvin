package com.example.ClinicaSpringBootBalvin.repositorios;

import com.example.ClinicaSpringBootBalvin.models.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMedicoRepositorio extends JpaRepository<Medico, Integer> {
}
