package com.example.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.modelo.Estudiant;
import com.example.demo1.repository.IEstudianteRep;

@Service
public class EstudianteServImpl implements IEstudianteServi{
	
	@Autowired
	private IEstudianteRep estudianteRep;

	@Override
	public void crear(Estudiant estudiant) {
		// TODO Auto-generated method stub
		this.estudianteRep.ingresar(estudiant);
		
	}

	@Override
	public void actualizar(Estudiant estudiant) {
		// TODO Auto-generated method stub
		this.estudianteRep.actualizar(estudiant);
	}

	@Override
	public Estudiant buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.estudianteRep.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.estudianteRep.eliminar(id);
	}
	

}
