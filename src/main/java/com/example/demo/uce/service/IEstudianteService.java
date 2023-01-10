package com.example.demo.uce.service;

import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteService {

	public void crear(Estudiante estudiante);
	
	public void actualizar(Estudiante estudiante);
	
	public Estudiante buscar(Integer id);
	
	public void eliminar(Integer id);
	
}
