package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	public Rutina() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Rutina(int idRutina, String nombreRutina, String descripcionRutina, String frecuenciaRutina,
			String duracionRutina) {
		super();
		this.idRutina = idRutina;
		this.nombreRutina = nombreRutina;
		this.descripcionRutina = descripcionRutina;
		this.frecuenciaRutina = frecuenciaRutina;
		this.duracionRutina = duracionRutina;
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
	
}
