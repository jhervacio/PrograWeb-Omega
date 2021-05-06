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
@Table(name = "rutina")
public class Rutina implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRutina;
	
	@Column(name="nombreRutina", nullable = false, length=30)
	private String nombreRutina;
	@Column(name = "descripcionRutina", nullable = false, length=50)
	private String descripcionRutina;
	@Column(name = "frecuenciaRutina", nullable = false, length=30)
	private String frecuenciaRutina;
	@Column(name = "duracionRutina", nullable = false, length=30)
	private String duracionRutina;
	

	@ManyToOne
	@JoinColumn(name="idCliente")
	private Cliente cliente;
	
	public Rutina() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Rutina(int idRutina, String nombreRutina, String descripcionRutina, String frecuenciaRutina,
			String duracionRutina, Cliente cliente) {
		super();
		this.idRutina = idRutina;
		this.nombreRutina = nombreRutina;
		this.descripcionRutina = descripcionRutina;
		this.frecuenciaRutina = frecuenciaRutina;
		this.duracionRutina = duracionRutina;
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getIdRutina() {
		return idRutina;
	}
	public void setIdRutina(int idRutina) {
		this.idRutina = idRutina;
	}
	public String getNombreRutina() {
		return nombreRutina;
	}
	public void setNombreRutina(String nombreRutina) {
		this.nombreRutina = nombreRutina;
	}
	public String getFrecuenciaRutina() {
		return frecuenciaRutina;
	}
	public void setFrecuenciaRutina(String frecuenciaRutina) {
		this.frecuenciaRutina = frecuenciaRutina;
	}
	public String getDuracionRutina() {
		return duracionRutina;
	}
	public void setDuracionRutina(String duracionRutina) {
		this.duracionRutina = duracionRutina;
	}

	public String getDescripcionRutina() {
		return descripcionRutina;
	}

	public void setDescripcionRutina(String descripcionRutina) {
		this.descripcionRutina = descripcionRutina;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((descripcionRutina == null) ? 0 : descripcionRutina.hashCode());
		result = prime * result + ((duracionRutina == null) ? 0 : duracionRutina.hashCode());
		result = prime * result + ((frecuenciaRutina == null) ? 0 : frecuenciaRutina.hashCode());
		result = prime * result + idRutina;
		result = prime * result + ((nombreRutina == null) ? 0 : nombreRutina.hashCode());
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
		Rutina other = (Rutina) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (descripcionRutina == null) {
			if (other.descripcionRutina != null)
				return false;
		} else if (!descripcionRutina.equals(other.descripcionRutina))
			return false;
		if (duracionRutina == null) {
			if (other.duracionRutina != null)
				return false;
		} else if (!duracionRutina.equals(other.duracionRutina))
			return false;
		if (frecuenciaRutina == null) {
			if (other.frecuenciaRutina != null)
				return false;
		} else if (!frecuenciaRutina.equals(other.frecuenciaRutina))
			return false;
		if (idRutina != other.idRutina)
			return false;
		if (nombreRutina == null) {
			if (other.nombreRutina != null)
				return false;
		} else if (!nombreRutina.equals(other.nombreRutina))
			return false;
		return true;
	}
	
}
