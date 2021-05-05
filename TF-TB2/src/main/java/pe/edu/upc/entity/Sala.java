package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sala")
public class Sala implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSala;
	
	
	@Column(name="nombreSala", nullable = false, length=30)
	private String nombreSala;
	
	@Column(name = "capacidadSala", nullable = false, length=30)
	private String capacidadSala;

	public Sala() {
		super();
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capacidadSala == null) ? 0 : capacidadSala.hashCode());
		result = prime * result + idSala;
		result = prime * result + ((nombreSala == null) ? 0 : nombreSala.hashCode());
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
		Sala other = (Sala) obj;
		if (capacidadSala == null) {
			if (other.capacidadSala != null)
				return false;
		} else if (!capacidadSala.equals(other.capacidadSala))
			return false;
		if (idSala != other.idSala)
			return false;
		if (nombreSala == null) {
			if (other.nombreSala != null)
				return false;
		} else if (!nombreSala.equals(other.nombreSala))
			return false;
		return true;
	}

	public Sala(int idSala, String nombreSala, String capacidadSala) {
		super();
		this.idSala = idSala;
		this.nombreSala = nombreSala;
		this.capacidadSala = capacidadSala;
	}

	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public String getNombreSala() {
		return nombreSala;
	}

	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}

	public String getCapacidadSala() {
		return capacidadSala;
	}

	public void setCapacidadSala(String capacidadSala) {
		this.capacidadSala = capacidadSala;
	}
	
	

}
