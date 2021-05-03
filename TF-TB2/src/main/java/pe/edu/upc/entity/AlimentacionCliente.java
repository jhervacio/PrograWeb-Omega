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
@Table(name = "alimentacion_cliente")
public class AlimentacionCliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAlimentacionCliente;
	
	@ManyToOne
	@JoinColumn(name="idAlimentacion", nullable=false)
	private Alimentacion alimentacion;
	
	@ManyToOne
	@JoinColumn(name="idCliente", nullable=false)
	private Cliente cliente;
	
	@Column(name="duracionporcliente", nullable = false, length=30)
	private String duracionporcliente;


	public AlimentacionCliente() {
		super();
		
	}


	public AlimentacionCliente(int idAlimentacionCliente, Alimentacion alimentacion, Cliente cliente,
			String duracionporcliente) {
		super();
		this.idAlimentacionCliente = idAlimentacionCliente;
		this.alimentacion = alimentacion;
		this.cliente = cliente;
		this.duracionporcliente = duracionporcliente;
	}


	public int getIdAlimentacionCliente() {
		return idAlimentacionCliente;
	}


	public void setIdAlimentacionCliente(int idAlimentacionCliente) {
		this.idAlimentacionCliente = idAlimentacionCliente;
	}


	public Alimentacion getAlimentacion() {
		return alimentacion;
	}


	public void setAlimentacion(Alimentacion alimentacion) {
		this.alimentacion = alimentacion;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public String getDuracionporcliente() {
		return duracionporcliente;
	}


	public void setDuracionporcliente(String duracionporcliente) {
		this.duracionporcliente = duracionporcliente;
	}


	


	
	
}
