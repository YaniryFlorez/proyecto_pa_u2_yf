package com.example.demo1.repository;

import com.example.demo1.modelo.Infcontacto;

public interface IInfcontactoRepo {

	public void ingresar(Infcontacto infcontacto);
	public void actualizar(Infcontacto infcontacto);
	public Infcontacto buscar(Integer id);
	public void eliminar(Integer id);
	
	
}
