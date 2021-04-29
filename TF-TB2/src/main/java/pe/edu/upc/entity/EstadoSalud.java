package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EstadoSalud")
public class EstadoSalud implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEstadoSalud;
	
	@Column(name="peso", nullable = false, length=30)
	private String peso;
	
	@Column(name = "estatura", nullable = false, length=50)
	private String estatura;
	
	@Column(name = "IMC", nullable = false, length=50)
	private String IMC;

	private Date fechasalud;

	public EstadoSalud() {
		super();
		
	}

	public EstadoSalud(int idEstadoSalud, String peso, String estatura, String iMC, Date fechasalud) {
		super();
		this.idEstadoSalud = idEstadoSalud;
		this.peso = peso;
		this.estatura = estatura;
		IMC = iMC;
		this.fechasalud = fechasalud;
	}

	public int getIdEstadoSalud() {
		return idEstadoSalud;
	}

	public void setIdEstadoSalud(int idEstadoSalud) {
		this.idEstadoSalud = idEstadoSalud;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getEstatura() {
		return estatura;
	}

	public void setEstatura(String estatura) {
		this.estatura = estatura;
	}

	public String getIMC() {
		return IMC;
	}

	public void setIMC(String iMC) {
		IMC = iMC;
	}

	public Date getFechasalud() {
		return fechasalud;
	}

	public void setFechasalud(Date fechasalud) {
		this.fechasalud = fechasalud;
	}

	

	
	
}
