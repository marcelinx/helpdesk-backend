package com.marcelino.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marcelino.helpdesk.domain.Chamado;
import com.marcelino.helpdesk.domain.Cliente;
import com.marcelino.helpdesk.domain.Tecnico;
import com.marcelino.helpdesk.domain.enums.Perfil;
import com.marcelino.helpdesk.domain.enums.Prioridade;
import com.marcelino.helpdesk.domain.enums.Status;
import com.marcelino.helpdesk.repositories.ChamadoRepository;
import com.marcelino.helpdesk.repositories.ClienteRepository;
import com.marcelino.helpdesk.repositories.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner{
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		Tecnico tec1 = new Tecnico(null, "Joao Marcelino", "12345678912", "joao@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Beatryz", "98765432121", "beatryz@gmail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "chamado 01", "primeiro chamado", tec1, cli1);
		
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
