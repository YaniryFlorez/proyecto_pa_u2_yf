package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;
import com.example.demo.uce.modelo.Profesor;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TableGenerator;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class ProfesorRepoImpl implements IProfesorRepo{
    
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Profesor profesor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Profesor profesor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Profesor buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
