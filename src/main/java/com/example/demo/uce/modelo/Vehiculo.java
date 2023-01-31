package com.example.demo.uce.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="vehiculo")
public class Vehiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "vehi_seq")
	@SequenceGenerator(name = "vehi_seq", sequenceName = "vehi_seq", allocationSize = 1)
	
	@Column(name="veh_id")
	private Integer id;
	
	@Column(name="veh_modelo")
	private String modelo;
	
	@Column(name="veh_placa")
	private String placa;
	
	@Column(name="veh_precio")
	private BigDecimal precio;
	
	@Column(name="veh_tipo")
	private String tipo;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="vehiculo_cliente", //nombre de la tabla de romppimiento
	joinColumns = @JoinColumn(name="vehcli_id_vehiculo"),
	inverseJoinColumns= @JoinColumn(name="vehcli_id_cliente"))//columna de libro
	
	//SET yGET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	
	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", modelo=" + modelo + ", placa=" + placa + ", precio=" + precio + ", tipo="
				+ tipo + "]";
	}
	
	
	
	



}
