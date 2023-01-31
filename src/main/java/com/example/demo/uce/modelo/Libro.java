package com.example.demo.uce.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name="libro")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "lib_seq")
	@SequenceGenerator(name = "lib_seq", sequenceName = "lib_seq", allocationSize = 1)


	@Column(name="lib_id")
	private Integer id;
	
	@Column(name="lib_nombre")
	private String nombre;
	
	@Column(name="lib_editorial")
	private String editorial;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="libro_autor", //nombre de la tabla de romppimiento
	joinColumns = @JoinColumn(name="liau_id_libro"),
	inverseJoinColumns= @JoinColumn(name="liau_id_autor"))//columna de libro
	
	private Set<Autor> autores;
	
	
	//set y get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public Set<Autor> getAutores() {
		return autores;
	}
	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}
	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + nombre + ", editorial=" + editorial + "]";
	}
	
	
	
}
