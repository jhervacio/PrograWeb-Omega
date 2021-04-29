package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Actividad;
import pe.edu.upc.service.IActividadService;

@Named
@RequestScoped
public class ActividadController implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Inject
	private IActividadService aService;
	private Actividad actividad ;
	List<Actividad> listaActividades;
	
	@PostConstruct
	public void init() {
		this.listaActividades = new ArrayList<Actividad>();
		this.actividad = new Actividad();
		this.listar();
	}
	
	public String nuevoActividad() {
		this.setActividad(new Actividad());
		return "actividad.xhtml";
	}
	
	public void insertar() {
		aService.insertar(actividad);
		limpiarActividad();
	}
	
	public void listar() {
		listaActividades = aService.listar();
	}
	
	public void limpiarActividad() {
		this.init();
	}
	
	public void eliminar(Actividad actividad) {
		aService.eliminar(actividad.getIdActividad());
		this.listar();
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public List<Actividad> getListaActividades() {
		return listaActividades;
	}

	public void setListaPlanes(List<Actividad> listaActividades) {
		this.listaActividades = listaActividades;
	}

	

}
