package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;

@SpringBootApplication
public class CrudSpringBootApplication implements CommandLineRunner{

	@Autowired
	private EstudianteRepositorio estudianteRepositorio;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	/*Estudiante estudiante = new Estudiante("Gonzalo","Hernandez", "gonzalo@gmail.com");
		estudianteRepositorio.save(estudiante);
		
		Estudiante estudiante1 = new Estudiante("Gonzalo1","Hernandez1", "gonzalo1@gmail.com");
		estudianteRepositorio.save(estudiante1);
		
		Estudiante estudiante2 = new Estudiante("Gonzalo2","Hernandez2", "gonzal2o@gmail.com");
		estudianteRepositorio.save(estudiante2);*/
	}

}
