package com.example.demo1.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="infcontacto")
public class Infcontacto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "infcon_seq")
	@SequenceGenerator(name = "infcon_seq", sequenceName = "infcon_seq", allocationSize = 1)
	
	@Column(name="inf_id")
	private Integer id;
	
	@Column(name="inf_pais")
	private String pais;
	
	@Column(name="inf_celular")
	private String celilar;
	
	@Column(name="inf_direccion")
	private String direccion;
	
	@OneToOne
	@JoinColumn(name ="est_id_contacto")
	private Estudiante estudiante;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCelilar() {
		return celilar;
	}

	public void setCelilar(String celilar) {
		this.celilar = celilar;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	
	
}
