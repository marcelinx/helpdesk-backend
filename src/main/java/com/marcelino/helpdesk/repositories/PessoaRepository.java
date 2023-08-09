package com.marcelino.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelino.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
