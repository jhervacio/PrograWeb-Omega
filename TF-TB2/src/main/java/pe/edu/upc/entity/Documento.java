package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "documento")
public class Documento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDocumento;
	
	@Column(name="tipoDocumento", nullable = false, length=30)
	private String tipoDocumento;
	@Column(name = "descripcionDocumento", nullable = false, length=50)
	private String descripcionDocumento;
	public Documento() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Documento(int idDocumento, String tipoDocumento, String descripcionDocumento) {
		super();
		this.idDocumento = idDocumento;
		this.tipoDocumento = tipoDocumento;
		this.descripcionDocumento = descripcionDocumento;
	}
	public int getIdDocumento() {
		return idDocumento;
	}
	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getDescripcionDocumento() {
		return descripcionDocumento;
	}
	public void setDescripcionDocumento(String descripcionDocumento) {
		this.descripcionDocumento = descripcionDocumento;
	}
	
	
}
