package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Alimentacion;
import pe.edu.upc.service.IAlimentacionService;

@Named
@RequestScoped
public class AlimentacionController implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Inject
	private IAlimentacionService aService;
	private Alimentacion alimentacion;
	List<Alimentacion> listaAlimentaciones;
	
	@PostConstruct
	public void init() {
		this.listaAlimentaciones = new ArrayList<Alimentacion>();
		this.alimentacion = new Alimentacion();
		this.listar();
	}
	
	public String nuevoAlimentacion() {
		this.setAlimentacion(new Alimentacion());
		return "alimentacion.xhtml";
	}
	
	public void insertar() {
		aService.insertar(alimentacion);
		limpiarAlimentacion();
	}
	
	public void listar() {
		listaAlimentaciones = aService.listar();
	}
	
	public void limpiarAlimentacion() {
		this.init();
	}
	
	public void eliminar(Alimentacion alimentacion) {
		aService.eliminar(alimentacion.getIdAlimentacion());
		this.listar();
	}

	public Alimentacion getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(Alimentacion alimentacion) {
		this.alimentacion = alimentacion;
	}

	public List<Alimentacion> getListaAlimentaciones() {
		return listaAlimentaciones;
	}

	public void setListaAlimentaciones(List<Alimentacion> listaAlimentaciones) {
		this.listaAlimentaciones = listaAlimentaciones;
	}

	

}
