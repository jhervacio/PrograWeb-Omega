package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Gimnasio;
import pe.edu.upc.service.IGimnasioService;

@Named
@RequestScoped
public class GimnasioController implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Inject
	private IGimnasioService gimService;
	private Gimnasio gimnasio ;
	List<Gimnasio> listaGimnasios;
	
	@PostConstruct
	public void init() {
		this.listaGimnasios = new ArrayList<Gimnasio>();
		this.gimnasio = new Gimnasio();
		this.listar();
	}
	
	public String nuevoGimnasio() {
		this.setGimnasio(new Gimnasio());
		return "gimnasio.xhtml";
	}
	
	public void insertar() {
		gimService.insertar(gimnasio);
		limpiarGimnasio();
	}
	
	public void listar() {
		listaGimnasios = gimService.listar();
	}
	
	public void limpiarGimnasio() {
		this.init();
	}
	
	public void eliminar(Gimnasio gimnasio) {
		gimService.eliminar(gimnasio.getIdGimnasio());
		this.listar();
	}

	public Gimnasio getGimnasio() {
		return gimnasio;
	}

	public void setGimnasio(Gimnasio gimnasio) {
		this.gimnasio = gimnasio;
	}

	public List<Gimnasio> getListaGimnasios() {
		return listaGimnasios;
	}

	public void setListaGimnasios(List<Gimnasio> listaGimnasios) {
		this.listaGimnasios = listaGimnasios;
	}

	

	

}
