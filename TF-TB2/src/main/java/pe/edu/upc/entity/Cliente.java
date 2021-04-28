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
	
	
	

}
