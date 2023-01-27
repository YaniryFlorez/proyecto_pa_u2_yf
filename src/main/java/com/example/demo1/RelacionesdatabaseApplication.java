package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo1.modelo.Estudiant;
import com.example.demo1.modelo.Infcontacto;
import com.example.demo1.service.IEstudianteServi;
import com.example.demo1.service.IInfcontactoServi;


@SpringBootApplication
public class RelacionesdatabaseApplication implements CommandLineRunner{
	@Autowired
	private IEstudianteServi estudianteServi;
	
	@Autowired
	private IInfcontactoServi infcontactoServi;
	

	public static void main(String[] args) {
		SpringApplication.run(RelacionesdatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiant estu =new Estudiant();
		Infcontacto infc = new Infcontacto();
		
		//estu.setInfcontacto(infc);
		//infc.setEstudiante(estu);
		
		/*Estudiant modi =this.estudianteServi.buscar(3);
		modi.setNombre("Yaniry");
		modi.setApellido("Flores");
		modi.setGenero("Femenino");*/
		
		
		//this.estudianteServi.crear(estu);
		
		//this.estudianteServi.actualizar(modi);
		
		//this.estudianteServi.borrar(1);

		
		
	}

}
