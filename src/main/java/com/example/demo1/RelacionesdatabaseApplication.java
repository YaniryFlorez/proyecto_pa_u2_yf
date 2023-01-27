package com.example.demo1;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo1.modelo.Estudiant;
import com.example.demo1.modelo.Infcontacto;
import com.example.demo1.modelo.Matricula;
import com.example.demo1.service.IEstudianteServi;
import com.example.demo1.service.IInfcontactoServi;
import com.example.demo1.service.IMatriculaServi;


@SpringBootApplication
public class RelacionesdatabaseApplication implements CommandLineRunner{
	@Autowired
	private IEstudianteServi estudianteServi;
	
	@Autowired
	private IInfcontactoServi infcontactoServi;
	
	@Autowired
	private IMatriculaServi matriculaServi;
	
	

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

		Estudiant estum =new Estudiant();
		Matricula mat =new Matricula();
		
		//estum.setNombre("maria");
		//estum.setApellido("Ruiz");
		//estum.setGenero("femenino");
		//List<Matricula> matric = new ArrayList<>();
		//mat.setSemestre("primero");
		//mat.setCosto(new BigDecimal(1234));
		//mat.setFecha(LocalDateTime.now());
		//mat.setEstudiante(estum);
		//matric.add(mat);
		//estum.setMatricula(matric);
		
		//this.estudianteServi.crear(estum);
		
		Estudiant estB =this.estudianteServi.buscar(5);
		
		//mat.setSemestre("segundo");
		//mat.setCosto(new BigDecimal(100));
		//mat.setFecha(LocalDateTime.now());
		//mat.setEstudiante(estB);
		
		//this.matriculaServi.crear(mat);
		
		//Sysout
		System.out.println(estB);
		System.out.println(estB.getMatricula());
		
		
		
		
		
		
		
		
		
		
	}

}
