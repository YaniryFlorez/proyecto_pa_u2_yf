package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IHabitacionService;
import com.example.demo.uce.service.IHotelService;


@SpringBootApplication
public class ProyectoPaU2YfApplication implements CommandLineRunner{
	
	@Autowired
	private IEmpleadoService empleServi;
	@Autowired
	private ICiudadanoService ciuSercive;
	
	@Autowired
	private IHabitacionService habitacionServi;
	
	@Autowired
	private IHotelService hotelServi;
	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2YfApplication.class, args);
	}
    @Override
	public void run(String...  args) throws Exception {
		 //Empleado emp= new Empleado();
		// Ciudadano ciu= new Ciudadano();
		 //ciu.setNombre("Yaniry");
        //ciu.setApellido("Florez");
         //ciu.setEmpleado(emp);
		// emp.setCiudadano(ciu);
		 //emp.setFechaIngreso(LocalDateTime.now());
		 //emp.setSalario(new BigDecimal(1000));
		 
		  //this.ciuSercive.crear(ciu);
         //this.empleServi.crear(emp);
         
        //Actualizar
	  /* Ciudadano encontrado=  this.ciuSercive.buscar(2);
	     encontrado.setNombre("Luis");
         encontrado.setApellido("Ruiz");
         this.ciuSercive.actualizar(encontrado);  */
    	
        //Eliminar
       //this.ciuSercive.eliminar(6);
    	
    	
      
    	//Hotel ho = new Hotel();
    	
    	
        //ingresar
		/*ho.setNombre("Hitlon Colon");
		ho.setDireccion("Qito");
		List<Habitacion> habitaciones = new ArrayList<>();
		Habitacion ha =new Habitacion();
		ha.setHotel(ho);
		ha.setNumero("A01");
		habitaciones.add(ha);
		Habitacion ha2 =new Habitacion();
		ha2.setHotel(ho);
		ha2.setNumero("A02");
		habitaciones.add(ha2);
		Habitacion ha3 =new Habitacion();
		ha3.setHotel(ho);
		ha3.setNumero("A03");
		habitaciones.add(ha3);
		
		ho.setHabitaciones(habitaciones);
		this.hotelServi.crear(ho);   */
		
		
		
		
		//Actualizar
		//Hotel hot=new Hotel();
		//hot.setNombre("Hilton Colon");
		//hot.setDireccion("Quito");
	   // this.hotelServi.actualizar(hot);
	    
	    //buscar
	     Hotel hotelB= this.hotelServi.buscar(4);
	     System.out.println(hotelB.getNombre());
	     
	     hotelB.getHabitaciones().forEach(System.out:: println);
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	    // this.habitacionServi.crear(ha);
	    
	    
	    
	    //eliminar
	    //this.hotelServi.eliminar(1);
	    
		
    	
      
	}
    
  
}
