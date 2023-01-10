package com.example.demo.uce.service;

import org.springframework.stereotype.Service;
import com.example.demo.uce.modelo.Profesor;

public interface IProfesorService {

	public void crear(Profesor profesor);
	
	public void actualizar(Profesor profesor);
	
	public Profesor buscar(Integer id);
	
	public void eliminar(Integer id);
	
}
