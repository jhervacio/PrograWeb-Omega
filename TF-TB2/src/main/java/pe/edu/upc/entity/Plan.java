package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plan")
public class Plan implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPlan;
	
	@Column(name="nombrePlan", nullable = false, length=30)
	private String nombrePlan;
	@Column(name = "precioPlan", nullable = false, length=30)
	private String precioPlan;
	@Column(name = "descripcionPlan", nullable = false, length=50)
	private String descripcionPlan;
	public Plan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plan(int idPlan, String nombrePlan, String precioPlan, String descripcionPlan) {
		super();
		this.idPlan = idPlan;
		this.nombrePlan = nombrePlan;
		this.precioPlan = precioPlan;
		this.descripcionPlan = descripcionPlan;
	}
	public int getIdPlan() {
		return idPlan;
	}
	public void setIdPlan(int idPlan) {
		this.idPlan = idPlan;
	}
	public String getNombrePlan() {
		return nombrePlan;
	}
	public void setNombrePlan(String nombrePlan) {
		this.nombrePlan = nombrePlan;
	}
	public String getPrecioPlan() {
		return precioPlan;
	}
	public void setPrecioPlan(String precioPlan) {
		this.precioPlan = precioPlan;
	}
	public String getDescripcionPlan() {
		return descripcionPlan;
	}
	public void setDescripcionPlan(String descripcionPlan) {
		this.descripcionPlan = descripcionPlan;
	}
	
	
}
