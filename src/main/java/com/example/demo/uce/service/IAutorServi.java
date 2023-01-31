package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Autor;

public interface IAutorServi {
	public void crear(Autor autor);
	public void actualizar(Autor autor);
	public Autor buscar(Integer id);
	public void borrar(Integer id);
}
