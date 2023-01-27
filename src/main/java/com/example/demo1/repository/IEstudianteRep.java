package com.example.demo1.repository;

import com.example.demo1.modelo.Estudiant;

public interface IEstudianteRep {

	public void ingresar(Estudiant estudiant);
	public void actualizar(Estudiant estudiant);
	public Estudiant buscar(Integer id);
	public void eliminar(Integer id);
	
}
