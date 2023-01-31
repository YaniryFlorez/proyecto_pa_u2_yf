package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Autor;
import com.example.demo.uce.repository.IAutorRepo;

@Service
public class AutorServImpl implements IAutorServi{
	
	@Autowired
	private IAutorRepo autorRepo;
	

	@Override
	public void crear(Autor autor) {
		// TODO Auto-generated method stub
		this.autorRepo.insertar(autor);
	}

	@Override
	public void actualizar(Autor autor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Autor buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
