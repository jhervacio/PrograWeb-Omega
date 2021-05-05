package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alimentacion")
public class Alimentacion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAlimentacion;
	
	@Column(name="nombreAlimentacion", nullable = false, length=30)
	private String nombreAlimentacion;
	@Column(name = "descripcionAlimentacion", nullable = false, length=50)
	private String descripcionAlimentacion;
	@Column(name = "duracionAlimentacion", nullable = false, length=30)
	private String duracionAlimentacion;
	public Alimentacion(int idAlimentacion, String nombreAlimentacion, String descripcionAlimentacion,
			String duracionAlimentacion) {
		super();
		this.idAlimentacion = idAlimentacion;
		this.nombreAlimentacion = nombreAlimentacion;
		this.descripcionAlimentacion = descripcionAlimentacion;
		this.duracionAlimentacion = duracionAlimentacion;
	}
	public Alimentacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdAlimentacion() {
		return idAlimentacion;
	}
	public void setIdAlimentacion(int idAlimentacion) {
		this.idAlimentacion = idAlimentacion;
	}
	public String getNombreAlimentacion() {
		return nombreAlimentacion;
	}
	public void setNombreAlimentacion(String nombreAlimentacion) {
		this.nombreAlimentacion = nombreAlimentacion;
	}
	public String getDescripcionAlimentacion() {
		return descripcionAlimentacion;
	}
	public void setDescripcionAlimentacion(String descripcionAlimentacion) {
		this.descripcionAlimentacion = descripcionAlimentacion;
	}
	public String getDuracionAlimentacion() {
		return duracionAlimentacion;
	}
	public void setDuracionAlimentacion(String duracionAlimentacion) {
		this.duracionAlimentacion = duracionAlimentacion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcionAlimentacion == null) ? 0 : descripcionAlimentacion.hashCode());
		result = prime * result + ((duracionAlimentacion == null) ? 0 : duracionAlimentacion.hashCode());
		result = prime * result + idAlimentacion;
		result = prime * result + ((nombreAlimentacion == null) ? 0 : nombreAlimentacion.hashCode());
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
		Alimentacion other = (Alimentacion) obj;
		if (descripcionAlimentacion == null) {
			if (other.descripcionAlimentacion != null)
				return false;
		} else if (!descripcionAlimentacion.equals(other.descripcionAlimentacion))
			return false;
		if (duracionAlimentacion == null) {
			if (other.duracionAlimentacion != null)
				return false;
		} else if (!duracionAlimentacion.equals(other.duracionAlimentacion))
			return false;
		if (idAlimentacion != other.idAlimentacion)
			return false;
		if (nombreAlimentacion == null) {
			if (other.nombreAlimentacion != null)
				return false;
		} else if (!nombreAlimentacion.equals(other.nombreAlimentacion))
			return false;
		return true;
	}
	
	
	
}
