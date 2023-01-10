package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.EstudianteServiceImpl;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2YfApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;
	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2YfApplication.class, args);
	}
    @Override
	public void run(String...  args) throws Exception {
		Estudiante estu = new Estudiante();
		
		estu.setNombre("Mabel");
		estu.setApellido("Rivera");
		estu.setCedula("1234567123");
		estu.setCiudad("Manta");
		estu.setGenero("fem");
		
      this.estudianteService.crear(estu);
       
	
       
      /* //actualizar
		Estudiante estuAct = estudianteService.buscar(1);
		estuAct.setApellido("Rivera");
       estuAct.setGenero("Femenino");
       this.estudianteService.actualizar(estuAct);  */
       
	}
    
  
}
