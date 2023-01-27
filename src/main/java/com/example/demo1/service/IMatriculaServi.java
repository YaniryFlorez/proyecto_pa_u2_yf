package com.example.demo1.service;

import com.example.demo1.modelo.Matricula;

public interface IMatriculaServi {

	public void crear(Matricula matricula);
	public void actualizar(Matricula matricula);
	public Matricula buscar(Integer id);
	public void borrar(Integer id);
}
