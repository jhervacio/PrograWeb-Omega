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
	
}
