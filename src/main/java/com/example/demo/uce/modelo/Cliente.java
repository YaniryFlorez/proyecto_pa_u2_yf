package com.example.demo.uce.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name="cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "clie_seq")
	@SequenceGenerator(name = "clie_seq", sequenceName = "clie_seq", allocationSize = 1)


	@Column(name ="clie_id")
    private Integer id;
	
	@Column(name ="clie_cedula")
    private String cedula;
	
	@Column(name ="clie_nombre")
    private String nombre;
	
	@Column(name ="clie_apellido")
    private String apellido;
	
	@Column(name ="clie_telefono")
    private String telefono;
	
	@ManyToMany(mappedBy = "clientes" ,cascade =CascadeType.DETACH)
	private Set<Vehiculo> vehiculo;
	
	
	//SET y GET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	
	public Set<Vehiculo> getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Set<Vehiculo> vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", telefono=" + telefono + "]";
	}
	
	
	
}
