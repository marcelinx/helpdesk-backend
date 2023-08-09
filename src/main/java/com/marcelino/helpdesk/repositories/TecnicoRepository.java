package com.marcelino.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelino.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
