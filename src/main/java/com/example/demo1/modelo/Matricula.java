package com.example.demo1.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="matricula")
public class Matricula {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "matri_seq")
	@SequenceGenerator(name = "matri_seq", sequenceName = "matri_seq", allocationSize = 1)
	
	@Column(name="matri_id")
	private Integer id;
	
	@Column(name="matri_semestre")
	private String semestre;
	
	@Column(name="matri_fecha")
	private LocalDateTime fecha;
	
	@Column(name="matri_costo")
	private BigDecimal costo;
	
	@ManyToOne
	@JoinColumn(name = "matri_id_estud")
	private Estudiant estudiante;
	
	// set y get

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getCosto() {
		return costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}
	
	

	public Estudiant getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiant estudiante) {
		this.estudiante = estudiante;
	}

	@Override
	public String toString() {
		return "Matricula [id=" + id + ", semestre=" + semestre + ", fecha=" + fecha + ", costo=" + costo + "]";
	}
	
	
	
 
}
