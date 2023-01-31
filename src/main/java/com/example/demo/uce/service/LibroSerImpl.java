package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Libro;
import com.example.demo.uce.repository.ILibroRepo;

import jakarta.persistence.EntityManager;

@Service
public class LibroSerImpl implements ILibroServi{
	
	@Autowired
	private EntityManager entityManager;
	

	@Override
	public void crear(Libro libro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro);
	}

	@Override
	public void actualizar(Libro libro) {
		// TODO Auto-generated method stub
		this.entityManager.merge(libro);
		
	}

	@Override
	public Libro buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Libro.class, id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
