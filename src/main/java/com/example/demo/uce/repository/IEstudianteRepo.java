package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Estudiante;
// crud va primary key
public interface IEstudianteRepo {
public void insertar(Estudiante estudiante);
public void actualizar(Estudiante estudiante);
public Estudiante buscar(Integer id);
public void eliminar(Integer id);
}
