package com.marcelino.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelino.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
