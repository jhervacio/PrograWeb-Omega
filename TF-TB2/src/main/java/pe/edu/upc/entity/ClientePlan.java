package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "cliente_plan")
public class ClientePlan implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idClientePlan;
	
	@ManyToOne
	@JoinColumn(name="idCliente", nullable=false)
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="idPlan", nullable=false)
	private Plan plan;

	public ClientePlan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClientePlan(int idClientePlan, Cliente cliente, Plan plan) {
		super();
		this.idClientePlan = idClientePlan;
		this.cliente = cliente;
		this.plan = plan;
	}

	public int getIdClientePlan() {
		return idClientePlan;
	}

	public void setIdClientePlan(int idClientePlan) {
		this.idClientePlan = idClientePlan;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	
	

}
