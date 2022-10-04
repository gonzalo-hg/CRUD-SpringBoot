package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.Estudiante;
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
	
	@GetMapping("/estudiantes/nuevo")
	public String mostrarFormularioRegistroFormulario(Model modelo) {
		Estudiante estudiante = new Estudiante();
		modelo.addAttribute("estudiante",estudiante);
		return "crear_estudiante";
	}
	
	@PostMapping("/estudiantes")
	public String guardarEstudiantes(
			@ModelAttribute("estudiante") Estudiante estudiante) {
		servicio.guardaEstudiante(estudiante);
		return "redirect:/estudiantes";
	}
}
