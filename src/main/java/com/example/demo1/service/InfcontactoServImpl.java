package com.example.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.modelo.Infcontacto;
import com.example.demo1.repository.IInfcontactoRepo;

@Service
public class InfcontactoServImpl implements IInfcontactoServi{
	
	@Autowired
	private IInfcontactoRepo infcontactoRepo;
	

	@Override
	public void crear(Infcontacto infcontacto) {
		// TODO Auto-generated method stub
		this.infcontactoRepo.ingresar(infcontacto);
	}

	@Override
	public void actualizar(Infcontacto infcontacto) {
		// TODO Auto-generated method stub
		this.infcontactoRepo.actualizar(infcontacto);
	}

	@Override
	public Infcontacto buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.infcontactoRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.infcontactoRepo.eliminar(id);
	}

}
