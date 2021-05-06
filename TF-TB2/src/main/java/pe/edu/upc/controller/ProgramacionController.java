package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Programacion;
import pe.edu.upc.service.IProgramacionService;

import pe.edu.upc.entity.Actividad;
import pe.edu.upc.service.IActividadService;
@Named
@RequestScoped
public class ProgramacionController implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Inject
	private IProgramacionService pService;
	@Inject
	private IActividadService aService;
	
	private Actividad actividad;
	
	private Programacion programacion ;
	
	List<Actividad> listaActividades;
	List<Programacion> listaProgramaciones;
	
	@PostConstruct
	public void init() {
		this.actividad=new Actividad();
		this.listaActividades= new ArrayList<Actividad>();
		this.listaProgramaciones = new ArrayList<Programacion>();
		this.programacion = new Programacion();
		this.listar();
		this.listActividad();
	}
	
	public String nuevoProgramacion() {
		this.setProgramacion(new Programacion());
		return "programacion.xhtml";
	}
	
	public void insertar() {
		pService.insertar(programacion);
		limpiarProgramacion();
	}
	
	public void listar() {
		listaProgramaciones = pService.listar();
	}
	
	public void listActividad() {
		listaActividades = aService.listar();
	}
	
	
	public void limpiarProgramacion() {
		this.init();
	}
	
	public void eliminar(Programacion programacion) {
		pService.eliminar(programacion.getIdProgramacion());
		this.listar();
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public Programacion getProgramacion() {
		return programacion;
	}

	public void setProgramacion(Programacion programacion) {
		this.programacion = programacion;
	}

	public List<Actividad> getListaActividades() {
		return listaActividades;
	}

	public void setListaActividades(List<Actividad> listaActividades) {
		this.listaActividades = listaActividades;
	}

	public List<Programacion> getListaProgramaciones() {
		return listaProgramaciones;
	}

	public void setListaProgramaciones(List<Programacion> listaProgramaciones) {
		this.listaProgramaciones = listaProgramaciones;
	}


	

	

}
