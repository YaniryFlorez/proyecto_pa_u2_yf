package com.example.demo1.modelo;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Table(name="estudiante")
public class Estudiant {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "estu_seq")
	@SequenceGenerator(name = "estu_seq", sequenceName = "estu_seq", allocationSize = 1)
	
	@Column(name="est_id")
	private Integer id;
	
	@Column(name="est_nombre")
	private String nombre;
	
	@Column(name="est_apellido")
	private String apellido;
	
	@Column(name="est_genero")
	private String genero;

	@OneToOne(mappedBy = "estudiante", cascade = CascadeType.ALL)
	private Infcontacto infcontacto;
	
	//SET GET

	public Integer getId() {
		return id;
	}

	public Infcontacto getInfcontacto() {
		return infcontacto;
	}

	public void setInfcontacto(Infcontacto infcontacto) {
		this.infcontacto = infcontacto;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	
	
	
}
