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
@Table(name = "cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;
	
	@Column(name="nombreCliente", nullable = false, length=30)
	private String nombreCliente;
	@Column(name = "apellidoCliente", nullable = false, length=30)
	private String apellidoCliente;
	@Column(name = "edadCliente", nullable = false, length=30)
	private String edadCliente;
	@Column(name = "pesoCliente",nullable = false, length=30)
	private String pesoCliente;
	@Column(name = "estaturaCliente", nullable = false, length=30)
	private String estaturaCliente;
	private Date fechaInscripcion;
	@Column(name = "planCliente", nullable = false, length=30)
	private String planCliente;
	public Cliente(int idCliente, String nombreCliente, String apellidoCliente, String edadCliente,
			 String pesoCliente, String estaturaCliente,Date fechaInscripcion, String planCliente) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.edadCliente = edadCliente;
		this.pesoCliente = pesoCliente;
		this.estaturaCliente = estaturaCliente;
		this.fechaInscripcion = fechaInscripcion;
		this.planCliente = planCliente;
	}
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidoCliente() {
		return apellidoCliente;
	}
	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}
	public String getEdadCliente() {
		return edadCliente;
	}
	public void setEdadCliente(String edadCliente) {
		this.edadCliente = edadCliente;
	}
	public Date getFechaInscripcion() {
		return fechaInscripcion;
	}
	public void setFechaInscripcion(Date fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	public String getPesoCliente() {
		return pesoCliente;
	}
	public void setPesoCliente(String pesoCliente) {
		this.pesoCliente = pesoCliente;
	}
	public String getEstaturaCliente() {
		return estaturaCliente;
	}
	public void setEstaturaCliente(String estaturaCliente) {
		this.estaturaCliente = estaturaCliente;
	}
	public String getPlanCliente() {
		return planCliente;
	}
	public void setPlanCliente(String planCliente) {
		this.planCliente = planCliente;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidoCliente == null) ? 0 : apellidoCliente.hashCode());
		result = prime * result + ((edadCliente == null) ? 0 : edadCliente.hashCode());
		result = prime * result + ((estaturaCliente == null) ? 0 : estaturaCliente.hashCode());
		result = prime * result + ((fechaInscripcion == null) ? 0 : fechaInscripcion.hashCode());
		result = prime * result + idCliente;
		result = prime * result + ((nombreCliente == null) ? 0 : nombreCliente.hashCode());
		result = prime * result + ((pesoCliente == null) ? 0 : pesoCliente.hashCode());
		result = prime * result + ((planCliente == null) ? 0 : planCliente.hashCode());
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
		Cliente other = (Cliente) obj;
		if (apellidoCliente == null) {
			if (other.apellidoCliente != null)
				return false;
		} else if (!apellidoCliente.equals(other.apellidoCliente))
			return false;
		if (edadCliente == null) {
			if (other.edadCliente != null)
				return false;
		} else if (!edadCliente.equals(other.edadCliente))
			return false;
		if (estaturaCliente == null) {
			if (other.estaturaCliente != null)
				return false;
		} else if (!estaturaCliente.equals(other.estaturaCliente))
			return false;
		if (fechaInscripcion == null) {
			if (other.fechaInscripcion != null)
				return false;
		} else if (!fechaInscripcion.equals(other.fechaInscripcion))
			return false;
		if (idCliente != other.idCliente)
			return false;
		if (nombreCliente == null) {
			if (other.nombreCliente != null)
				return false;
		} else if (!nombreCliente.equals(other.nombreCliente))
			return false;
		if (pesoCliente == null) {
			if (other.pesoCliente != null)
				return false;
		} else if (!pesoCliente.equals(other.pesoCliente))
			return false;
		if (planCliente == null) {
			if (other.planCliente != null)
				return false;
		} else if (!planCliente.equals(other.planCliente))
			return false;
		return true;
	}
	
	
	

}
