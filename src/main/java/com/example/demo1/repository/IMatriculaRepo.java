package com.example.demo1.repository;

import com.example.demo1.modelo.Matricula;

public interface IMatriculaRepo {

	public void ingresar(Matricula matricula);
	public void actualizar(Matricula matricula);
	public Matricula buscar(Integer id);
	public void eliminar(Integer id);
}
