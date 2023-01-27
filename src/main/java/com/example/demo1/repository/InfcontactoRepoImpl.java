package com.example.demo1.repository;

import org.springframework.stereotype.Repository;

import com.example.demo1.modelo.Infcontacto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class InfcontactoRepoImpl implements IInfcontactoRepo{
	
	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public void ingresar(Infcontacto infcontacto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(infcontacto);
	}

	@Override
	public void actualizar(Infcontacto infcontacto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(infcontacto);
	}

	@Override
	public Infcontacto buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Infcontacto.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Infcontacto inf=this.buscar(id);
		this.entityManager.remove(inf);
	}

}
