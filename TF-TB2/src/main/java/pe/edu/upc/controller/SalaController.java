package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Sala;
import pe.edu.upc.service.ISalaService;

@Named
@RequestScoped
public class SalaController implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Inject
	private ISalaService sService;
	private Sala sala;
	List<Sala> listaSalas;
	
	@PostConstruct
	public void init() {
		this.listaSalas = new ArrayList<Sala>();
		this.sala = new Sala();
		this.listar();
	}
	
	public String nuevoSala() {
		this.setSala(new Sala());
		return "sala.xhtml";
	}
	
	public void insertar() {
		sService.insertar(sala);
		limpiarSala();
	}
	
	public void listar() {
		listaSalas = sService.listar();
	}
	
	public void limpiarSala() {
		this.init();
	}
	
	public void eliminar(Sala sala) {
		sService.eliminar(sala.getIdSala());
		this.listar();
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public List<Sala> getListaSalas() {
		return listaSalas;
	}

	public void setListaSalas(List<Sala> listaSalas) {
		this.listaSalas = listaSalas;
	}

	
	

}
