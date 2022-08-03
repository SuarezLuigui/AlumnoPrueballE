package com.idat.AlumnoPruebaIIE.service;

import java.util.List;

import com.idat.AlumnoPruebaIIE.model.Alumno;

public interface AlumnoService {
	
	List<Alumno> listar();
	Alumno obtenerId(Integer id);
	void guardar(Alumno alumno);
	void eliminar(Integer id);
	void actualizar(Alumno alumno);
	
}
