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

import pe.edu.upc.entity.Distrito;
import pe.edu.upc.service.IDistritoService;
@Named
@RequestScoped
public class GimnasioController implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Inject
	private IGimnasioService gimService;
	@Inject
	private IDistritoService dService;
	
	private Distrito distrito;
	
	private Gimnasio gimnasio ;
	
	List<Distrito> listaDistritos;
	List<Gimnasio> listaGimnasios;
	
	@PostConstruct
	public void init() {
		this.distrito=new Distrito();
		this.listaDistritos= new ArrayList<Distrito>();
		this.listaGimnasios = new ArrayList<Gimnasio>();
		this.gimnasio = new Gimnasio();
		this.listar();
		this.listDistrito();
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
	
	public void listDistrito() {
		listaDistritos = dService.listar();
	}
	
	
	public void limpiarGimnasio() {
		this.init();
	}
	
	public void eliminar(Gimnasio gimnasio) {
		gimService.eliminar(gimnasio.getIdGimnasio());
		this.listar();
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public Gimnasio getGimnasio() {
		return gimnasio;
	}

	public void setGimnasio(Gimnasio gimnasio) {
		this.gimnasio = gimnasio;
	}

	public List<Distrito> getListaDistritos() {
		return listaDistritos;
	}

	public void setListaDistritos(List<Distrito> listaDistritos) {
		this.listaDistritos = listaDistritos;
	}

	public List<Gimnasio> getListaGimnasios() {
		return listaGimnasios;
	}

	public void setListaGimnasios(List<Gimnasio> listaGimnasios) {
		this.listaGimnasios = listaGimnasios;
	}

	

	

	

}
