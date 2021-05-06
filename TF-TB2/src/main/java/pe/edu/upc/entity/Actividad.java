package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Actividad")
public class Actividad implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idActividad;
	
	@ManyToOne
	@JoinColumn(name="idSala", nullable=false)
	private Sala sala;
	
	@Column(name="nombreActividad", nullable = false, length=30)
	private String nombreActividad;
	
	@Column(name = "descripcionActividad", nullable = false, length=50)
	private String descripcionActividad;


	public Actividad() {
		super();
		
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcionActividad == null) ? 0 : descripcionActividad.hashCode());
		result = prime * result + idActividad;
		result = prime * result + ((nombreActividad == null) ? 0 : nombreActividad.hashCode());
		result = prime * result + ((sala == null) ? 0 : sala.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Actividad other = (Actividad) obj;
		if (descripcionActividad == null) {
			if (other.descripcionActividad != null)
				return false;
		} else if (!descripcionActividad.equals(other.descripcionActividad))
			return false;
		if (idActividad != other.idActividad)
			return false;
		if (nombreActividad == null) {
			if (other.nombreActividad != null)
				return false;
		} else if (!nombreActividad.equals(other.nombreActividad))
			return false;
		if (sala == null) {
			if (other.sala != null)
				return false;
		} else if (!sala.equals(other.sala))
			return false;
		return true;
	}


	public Actividad(int idActividad, Sala sala, String nombreActividad, String descripcionActividad) {
		super();
		this.idActividad = idActividad;
		this.sala = sala;
		this.nombreActividad = nombreActividad;
		this.descripcionActividad = descripcionActividad;
	}


	public int getIdActividad() {
		return idActividad;
	}


	public void setIdActividad(int idActividad) {
		this.idActividad = idActividad;
	}


	public Sala getSala() {
		return sala;
	}


	public void setSala(Sala sala) {
		this.sala = sala;
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
