package com.example.demo1.repository;

import org.springframework.stereotype.Repository;

import com.example.demo1.modelo.Estudiant;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class EstudianteRepImpl implements IEstudianteRep{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Estudiant estudiant) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiant);
		
	}

	@Override
	public void actualizar(Estudiant estudiant) {
		// TODO Auto-generated method stub
		this.entityManager.merge(estudiant);
	}

	@Override
	public Estudiant buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiant.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Estudiant estu=this.buscar(id);
		this.entityManager.remove(estu);
		
	}

}
