package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Vehiculo;

public interface IVehiculoServi {
	public void crear(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public Vehiculo buscar(Integer id);
	public void borrar(Integer id);
}
