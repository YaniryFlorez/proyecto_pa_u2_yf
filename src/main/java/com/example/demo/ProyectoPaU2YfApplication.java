package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Autor;
import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Cliente;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.modelo.Libro;
import com.example.demo.uce.modelo.Vehiculo;
import com.example.demo.uce.repository.ILibroRepo;
import com.example.demo.uce.service.IAutorServi;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IClienteServi;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IHabitacionService;
import com.example.demo.uce.service.IHotelService;
import com.example.demo.uce.service.ILibroServi;
import com.example.demo.uce.service.IVehiculoServi;


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
	
	@Autowired
	private IAutorServi autorServi;
	
	@Autowired
	private ILibroServi libroServi;
	
	@Autowired
	private IVehiculoServi vehiculoServi;
	
	@Autowired
	private IClienteServi clienteServi;
	
	
	


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
	    // Hotel hotelB= this.hotelServi.buscar(4);
	     //System.out.println(hotelB.getNombre());
	     
	    // hotelB.getHabitaciones().forEach(System.out:: println);
	     
	        
	     
	    // this.habitacionServi.crear(ha);
	    
	    
	    
	    //eliminar
	    //this.hotelServi.eliminar(1);
	    
		// LIBRO AUTOR
    	/*
    	Autor autor = new Autor();
    	autor.setNombre("WS");
    	
    	Autor autor2 = new Autor();
    	autor2.setNombre("WY");
    	
    	Autor autor3 = new Autor();
    	autor3.setNombre("JS");
    	
    	Autor autor4 = new Autor();
    	autor4.setNombre("OM");
    	
    	
    	Libro libro = new Libro();
    	Libro libro2 = new Libro();
    	libro.setEditorial("NORMA");
    	libro2.setEditorial("Patito");
    	libro.setNombre("P. Web");
    	libro2.setNombre("Redes");
    	
    	Set<Autor> autores = new HashSet<>();
    	Set<Autor> autores2 = new HashSet<>();
    	Set<Libro> libros = new HashSet<>();
    	Set<Libro> libros2 = new HashSet<>();
    	Set<Libro> libros3 = new HashSet<>();
    	
    	autores.add(autor);
    	autores.add(autor4);
    	autores2.add(autor);
    	autores2.add(autor2);
    	autores2.add(autor3);
    	
    	libros.add(libro2);
    	libros3.add(libro);
    	libros2.add(libro);
    	libros2.add(libro2);
    	
    	autor.setLibros(libros2);
    	autor2.setLibros(libros);
    	autor3.setLibros(libros);
    	autor4.setLibros(libros3);
    	
    	libro.setAutores(autores);
    	libro2.setAutores(autores2);
    	this.autorServi.crear(autor); */
    	
    	//VEHICULO CLIENTE
    	
    Cliente cli1 = new Cliente();
    Cliente cli2 = new Cliente();
    Cliente cli3 = new Cliente();
   
    cli1.setCedula("123");
    cli1.setNombre("Ana");
    cli1.setApellido("Lopez");
    cli1.setTelefono("1298776");
    
    cli2.setCedula("124");
    cli2.setNombre("Luis");
    cli2.setApellido("Llanos");
    cli2.setTelefono("9864343");
    
    cli3.setCedula("125");
    cli3.setNombre("Marco");
    cli3.setApellido("Dias");
    cli3.setTelefono("284537");
    	
    	
    	
    	Vehiculo veh1 = new Vehiculo();
    	Vehiculo veh2 = new Vehiculo();
    	
    	veh1.setModelo("2015");
    	veh1.setPlaca("123AB");
    	veh1.setPrecio(new BigDecimal(12000));
    	veh1.setTipo("Campero");
    	
    	veh1.setModelo("2022");
    	veh1.setPlaca("113AC");
    	veh1.setPrecio(new BigDecimal(20000));
    	veh1.setTipo("Automovil");
    	
    	
    	
    	Set<Cliente> clientes = new HashSet<>();
    	Set<Cliente> clientes2 = new HashSet<>();
    	
    	Set<Libro> vehiculo = new HashSet<>();
    	Set<Libro> vehiculo2 = new HashSet<>();
    	Set<Libro> vehiculo3 = new HashSet<>(); 
    	
    		
      
	}
    
  
}
