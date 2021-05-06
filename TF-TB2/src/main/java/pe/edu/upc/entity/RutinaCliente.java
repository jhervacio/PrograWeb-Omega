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
@Table(name = "rutina_cliente")
public class RutinaCliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRutinaCliente;
	
	@ManyToOne
	@JoinColumn(name="idRutina", nullable=false)
	private Rutina rutina;
	
	@ManyToOne
	@JoinColumn(name="idCliente", nullable=false)
	private Cliente cliente;
	
	@Column(name="duracionRutina", nullable = false, length=30)
	private String duracionRutina;


	public RutinaCliente() {
		super();
		
	}


	public RutinaCliente(int idRutinaCliente, Rutina rutina, Cliente cliente, String duracionRutina) {
		super();
		this.idRutinaCliente = idRutinaCliente;
		this.rutina = rutina;
		this.cliente = cliente;
		this.duracionRutina = duracionRutina;
	}


	public int getIdRutinaCliente() {
		return idRutinaCliente;
	}


	public void setIdRutinaCliente(int idRutinaCliente) {
		this.idRutinaCliente = idRutinaCliente;
	}


	public Rutina getRutina() {
		return rutina;
	}


	public void setRutina(Rutina rutina) {
		this.rutina = rutina;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public String getDuracionRutina() {
		return duracionRutina;
	}


	public void setDuracionRutina(String duracionRutina) {
		this.duracionRutina = duracionRutina;
	}


	
	
}
