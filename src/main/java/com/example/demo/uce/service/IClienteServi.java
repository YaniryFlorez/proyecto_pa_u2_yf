package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Cliente;

public interface IClienteServi {
	public void crear(Cliente cliente);
	public void actualizar(Cliente cliente);
	public Cliente buscar(Integer id);
	public void borrar(Integer id);
}
