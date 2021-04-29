package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.EstadoSalud;
import pe.edu.upc.service.IEstadoSaludService;

@Named
@RequestScoped
public class EstadoSaludController implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Inject
	private IEstadoSaludService mService;
	private EstadoSalud estadoSalud;
	List<EstadoSalud> listaEstadoSaluds;
	
	@PostConstruct
	public void init() {
		this.listaEstadoSaluds = new ArrayList<EstadoSalud>();
		this.estadoSalud = new EstadoSalud();
		this.listar();
	}
	
	public String nuevoEstadoSalud() {
		this.setEstadoSalud(new EstadoSalud());
		return "estadosalud.xhtml";
	}
	
	public void insertar() {
		mService.insertar(estadoSalud);
		limpiarEstadoSalud();
	}
	
	public void listar() {
		listaEstadoSaluds = mService.listar();
	}
	
	public void limpiarEstadoSalud() {
		this.init();
	}
	
	public void eliminar(EstadoSalud estadoSalud) {
		mService.eliminar(estadoSalud.getIdEstadoSalud());
		this.listar();
	}

	public EstadoSalud getEstadoSalud() {
		return estadoSalud;
	}

	public void setEstadoSalud(EstadoSalud estadoSalud) {
		this.estadoSalud = estadoSalud;
	}

	public List<EstadoSalud> getListaEstadoSaluds() {
		return listaEstadoSaluds;
	}

	public void setListaEstadoSaluds(List<EstadoSalud> listaEstadoSaluds) {
		this.listaEstadoSaluds = listaEstadoSaluds;
	}

	

	

}
