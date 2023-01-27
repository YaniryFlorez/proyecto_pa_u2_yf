package com.example.demo1.service;

import com.example.demo1.modelo.Estudiant;

public interface IEstudianteServi {

	public void crear(Estudiant estudiant);
	public void actualizar(Estudiant estudiant);
	public Estudiant buscar(Integer id);
	public void borrar(Integer id);
}
