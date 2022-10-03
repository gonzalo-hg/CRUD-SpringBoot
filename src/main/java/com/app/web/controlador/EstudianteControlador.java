package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.web.repositorio.EstudianteRepositorio;
import com.app.web.servicio.EstudianteServicio;

@Controller
public class EstudianteControlador {

	@Autowired
	private EstudianteServicio servicio;
	
	@GetMapping({"/estudiantes", "/"})
	public String listarEstudiantes(Model model) {
		model.addAttribute("estudiantes",servicio.listarTodosEstudiantes());
		return "estudiantes";//retorna al archivo estudiantes
	}
}
