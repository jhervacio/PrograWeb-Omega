package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Administrador;
import pe.edu.upc.service.IAdministradorService;

@Named
@RequestScoped
public class AdministradorController implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Inject
	private IAdministradorService adService;
	private Administrador administrador ;
	List<Administrador> listaAdministradores;
	
	@PostConstruct
	public void init() {
		this.listaAdministradores = new ArrayList<Administrador>();
		this.administrador = new Administrador();
		this.listar();
	}
	
	public String nuevoAdministrador() {
		this.setAdministrador(new Administrador());
		return "administrador.xhtml";
	}
	
	public void insertar() {
		adService.insertar(administrador);
		limpiarAdministrador();
	}
	
	public void listar() {
		listaAdministradores = adService.listar();
	}
	
	public void limpiarAdministrador() {
		this.init();
	}
	
	public void eliminar(Administrador administrador) {
		adService.eliminar(administrador.getIdAdministrador());
		this.listar();
	}

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

	public List<Administrador> getListaAdministradores() {
		return listaAdministradores;
	}

	public void setListaAdministradores(List<Administrador> listaAdministradores) {
		this.listaAdministradores = listaAdministradores;
	}

	
	

	

}
