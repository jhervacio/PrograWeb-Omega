package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Programacion")
public class Programacion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProgramacion;
	
	@ManyToOne
	@JoinColumn(name="idActividad", nullable=false)
	private Actividad actividad;
	

	private Date fechaProgramacion;
	
	@Column(name = "HoraInicial", nullable = false, length=50)
	private String horainicial;

	@Column(name = "HoraFinal", nullable = false, length=50)
	private String horafinal;
	
	public Programacion() {
		super();
		
	}

	public Programacion(int idProgramacion, Actividad actividad, Date fechaProgramacion, String horainicial,
			String horafinal) {
		super();
		this.idProgramacion = idProgramacion;
		this.actividad = actividad;
		this.fechaProgramacion = fechaProgramacion;
		this.horainicial = horainicial;
		this.horafinal = horafinal;
	}

	public int getIdProgramacion() {
		return idProgramacion;
	}

	public void setIdProgramacion(int idProgramacion) {
		this.idProgramacion = idProgramacion;
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public Date getFechaProgramacion() {
		return fechaProgramacion;
	}

	public void setFechaProgramacion(Date fechaProgramacion) {
		this.fechaProgramacion = fechaProgramacion;
	}

	public String getHorainicial() {
		return horainicial;
	}

	public void setHorainicial(String horainicial) {
		this.horainicial = horainicial;
	}

	public String getHorafinal() {
		return horafinal;
	}

	public void setHorafinal(String horafinal) {
		this.horafinal = horafinal;
	}

	
	


	
	
	
}
