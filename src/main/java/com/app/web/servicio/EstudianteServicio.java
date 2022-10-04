package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Estudiante;

public interface EstudianteServicio {

	public List<Estudiante> listarTodosEstudiantes();
	
	public Estudiante guardaEstudiante(Estudiante estudiante);
}
