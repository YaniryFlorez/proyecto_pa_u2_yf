package com.example.demo1.repository;

import com.example.demo1.modelo.Estudiante;

public interface IEstudianteRepo {

	public void ingresar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public Estudiante buscar(Integer id);
	public void eliminar(Integer id);
	
}
