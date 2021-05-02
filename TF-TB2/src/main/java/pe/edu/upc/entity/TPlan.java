package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tplan")
public class TPlan implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTPlan;
	
	@Column(name="tipoPlan", nullable = false, length=30)
	private String tipoPlan;
	
	
	public TPlan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TPlan(int idTPlan, String tipoPlan) {
		super();
		this.idTPlan = idTPlan;
		this.tipoPlan = tipoPlan;
	}

	public int getIdTPlan() {
		return idTPlan;
	}

	public void setIdTPlan(int idTPlan) {
		this.idTPlan = idTPlan;
	}

	public String getTipoPlan() {
		return tipoPlan;
	}

	public void setTipoPlan(String tipoPlan) {
		this.tipoPlan = tipoPlan;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idTPlan;
		result = prime * result + ((tipoPlan == null) ? 0 : tipoPlan.hashCode());
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
		TPlan other = (TPlan) obj;
		if (idTPlan != other.idTPlan)
			return false;
		if (tipoPlan == null) {
			if (other.tipoPlan != null)
				return false;
		} else if (!tipoPlan.equals(other.tipoPlan))
			return false;
		return true;
	}
	
	
}
