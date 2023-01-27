package com.example.demo1.service;

import com.example.demo1.modelo.Infcontacto;

public interface IInfcontactoServi {

	public void crear(Infcontacto infcontacto);
	public void actualizar(Infcontacto infcontacto);
	public Infcontacto buscar(Integer id);
	public void borrar(Integer id);
}
