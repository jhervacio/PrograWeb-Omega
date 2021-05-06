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

@SuppressWarnings("unused")
@Entity
@Table(name = "actividad_cliente")
public class ActividadCliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idActividadCliente;
	
	@ManyToOne
	@JoinColumn(name="idActividad", nullable=false)
	private Actividad actividad;
	
	@ManyToOne
	@JoinColumn(name="idCliente", nullable=false)
	private Cliente cliente;
	


	public ActividadCliente() {
		super();
		
	}



	public int getIdActividadCliente() {
		return idActividadCliente;
	}



	public void setIdActividadCliente(int idActividadCliente) {
		this.idActividadCliente = idActividadCliente;
	}



	public Actividad getActividad() {
		return actividad;
	}



	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public ActividadCliente(int idActividadCliente, Actividad actividad, Cliente cliente) {
		super();
		this.idActividadCliente = idActividadCliente;
		this.actividad = actividad;
		this.cliente = cliente;
	}



	

	

	


	
	
}
