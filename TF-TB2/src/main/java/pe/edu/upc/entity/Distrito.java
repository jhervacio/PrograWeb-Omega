package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Distrito")
public class Distrito implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDistrito;
	
	@Column(name="nombreDistrito", nullable = false, length=30)
	private String nombreDistrito;
	
	public Distrito() {
		super();
		
	}



	public Distrito(int idDistrito, String nombreDistrito) {
		super();
		this.idDistrito = idDistrito;
		this.nombreDistrito = nombreDistrito;
	}

	public int getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getNombreDistrito() {
		return nombreDistrito;
	}

	public void setNombreDistrito(String nombreDistrito) {
		this.nombreDistrito = nombreDistrito;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idDistrito;
		result = prime * result + ((nombreDistrito == null) ? 0 : nombreDistrito.hashCode());
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
		Distrito other = (Distrito) obj;
		if (idDistrito != other.idDistrito)
			return false;
		if (nombreDistrito == null) {
			if (other.nombreDistrito != null)
				return false;
		} else if (!nombreDistrito.equals(other.nombreDistrito))
			return false;
		return true;
	}
	
	
	
	
}
