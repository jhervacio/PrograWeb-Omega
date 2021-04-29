package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Actividad")
public class Actividad implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idActividad;
	
	@Column(name="nombreActividad", nullable = false, length=30)
	private String nombreActividad;
	
	@Column(name = "descripcionActividad", nullable = false, length=50)
	private String descripcionActividad;


	public Actividad() {
		super();
		
	}


	public Actividad(int idActividad, String nombreActividad, String precioActividad, String descripcionActividad) {
		super();
		this.idActividad = idActividad;
		this.nombreActividad = nombreActividad;
		
		this.descripcionActividad = descripcionActividad;
	}


	public int getIdActividad() {
		return idActividad;
	}


	public void setIdActividad(int idActividad) {
		this.idActividad = idActividad;
	}


	public String getNombreActividad() {
		return nombreActividad;
	}


	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad = nombreActividad;
	}



	public String getDescripcionActividad() {
		return descripcionActividad;
	}


	public void setDescripcionActividad(String descripcionActividad) {
		this.descripcionActividad = descripcionActividad;
	}
	
	
	
}
