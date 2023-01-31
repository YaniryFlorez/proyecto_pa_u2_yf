package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Libro;
import com.example.demo.uce.repository.ILibroRepo;

@Service
public class LibroServImpl implements ILibroServi{
	
	@Autowired
	private ILibroRepo libroRepo;
	

	@Override
	public void crear(Libro libro) {
		// TODO Auto-generated method stub
		this.libroRepo.insertar(libro);
	}

	@Override
	public void actualizar(Libro libro) {
		// TODO Auto-generated method stub
		this.libroRepo.actualizar(libro);
	}

	@Override
	public Libro buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.libroRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
