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
	
	@ManyToOne
	@JoinColumn(name="idTPlan")
	private TPlan tplan;
	
	public Plan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plan(int idPlan, String nombrePlan, String precioPlan, String descripcionPlan,TPlan tplan) {
		super();
		this.idPlan = idPlan;
		this.nombrePlan = nombrePlan;
		this.precioPlan = precioPlan;
		this.descripcionPlan = descripcionPlan;
		this.tplan=tplan;
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
	public TPlan getTplan() {
		return tplan;
	}
	public void setTplan(TPlan tplan) {
		this.tplan = tplan;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcionPlan == null) ? 0 : descripcionPlan.hashCode());
		result = prime * result + idPlan;
		result = prime * result + ((nombrePlan == null) ? 0 : nombrePlan.hashCode());
		result = prime * result + ((precioPlan == null) ? 0 : precioPlan.hashCode());
		result = prime * result + ((tplan == null) ? 0 : tplan.hashCode());
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
		Plan other = (Plan) obj;
		if (descripcionPlan == null) {
			if (other.descripcionPlan != null)
				return false;
		} else if (!descripcionPlan.equals(other.descripcionPlan))
			return false;
		if (idPlan != other.idPlan)
			return false;
		if (nombrePlan == null) {
			if (other.nombrePlan != null)
				return false;
		} else if (!nombrePlan.equals(other.nombrePlan))
			return false;
		if (precioPlan == null) {
			if (other.precioPlan != null)
				return false;
		} else if (!precioPlan.equals(other.precioPlan))
			return false;
		if (tplan == null) {
			if (other.tplan != null)
				return false;
		} else if (!tplan.equals(other.tplan))
			return false;
		return true;
	}
	
	
	
}
