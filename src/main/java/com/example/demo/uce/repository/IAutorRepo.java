package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Autor;


public interface IAutorRepo {
	public void insertar(Autor autor);
	public void actualizar(Autor autor);
	public Autor buscar(Integer id);
	public void eliminar(Integer id);
}