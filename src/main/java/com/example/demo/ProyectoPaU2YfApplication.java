package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;


@SpringBootApplication
public class ProyectoPaU2YfApplication implements CommandLineRunner{
	
	@Autowired
	private IEmpleadoService empleServi;
	@Autowired
	private ICiudadanoService ciuSercive;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2YfApplication.class, args);
	}
    @Override
	public void run(String...  args) throws Exception {
		 Empleado emp= new Empleado();
		 Ciudadano ciu= new Ciudadano();
		 
		 ciu.setNombre("Yaniry");
         ciu.setApellido("Florez");
         //ciu.setEmpleado(emp);
        
       
		 emp.setCiudadano(ciu);
		 emp.setFechaIngreso(LocalDateTime.now());
		 emp.setSalario(new BigDecimal(1000));
		 
		  
		 this.ciuSercive.crear(ciu);
         this.empleServi.crear(emp);
         
        
        
      
      
      
	}
    
  
}
