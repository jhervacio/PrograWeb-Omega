package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Entrenador;
import pe.edu.upc.service.IEntrenadorService;

@Named
@RequestScoped
public class EntrenadorController implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Inject
	private IEntrenadorService entService;
	private Entrenador entrenador ;
	List<Entrenador> listaEntrenadores;
	
	@PostConstruct
	public void init() {
		this.listaEntrenadores = new ArrayList<Entrenador>();
		this.entrenador = new Entrenador();
		this.listar();
	}
	
	public String nuevoEntrenador() {
		this.setEntrenador(new Entrenador());
		return "entrenador.xhtml";
	}
	
	public void insertar() {
		entService.insertar(entrenador);
		limpiarEntrenador();
	}
	
	public void listar() {
		listaEntrenadores = entService.listar();
	}
	
	public void limpiarEntrenador() {
		this.init();
	}
	
	public void eliminar(Entrenador entrenador) {
		entService.eliminar(entrenador.getIdEntrenador());
		this.listar();
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public List<Entrenador> getListaEntrenadores() {
		return listaEntrenadores;
	}

	public void setListaEntrenadores(List<Entrenador> listaEntrenadores) {
		this.listaEntrenadores = listaEntrenadores;
	}

	

	

}
