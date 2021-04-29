package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Rutina;
import pe.edu.upc.service.IRutinaService;

@Named
@RequestScoped
public class RutinaController implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Inject
	private IRutinaService rService;
	private Rutina rutina;
	List<Rutina> listaRutinas;
	
	@PostConstruct
	public void init() {
		this.listaRutinas = new ArrayList<Rutina>();
		this.rutina = new Rutina();
		this.listar();
	}
	
	public String nuevoRutina() {
		this.setRutina(new Rutina());
		return "rutina.xhtml";
	}
	
	public void insertar() {
		rService.insertar(rutina);
		limpiarRutina();
	}
	
	public void listar() {
		listaRutinas = rService.listar();
	}
	
	public void limpiarRutina() {
		this.init();
	}
	
	public void eliminar(Rutina rutina) {
		rService.eliminar(rutina.getIdRutina());
		this.listar();
	}

	public Rutina getRutina() {
		return rutina;
	}

	public void setRutina(Rutina rutina) {
		this.rutina = rutina;
	}

	public List<Rutina> getListaRutinas() {
		return listaRutinas;
	}

	public void setListaRutinas(List<Rutina> listaRutinas) {
		this.listaRutinas = listaRutinas;
	}

	

}
