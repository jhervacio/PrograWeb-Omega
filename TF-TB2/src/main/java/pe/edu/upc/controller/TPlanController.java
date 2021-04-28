package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.TPlan;
import pe.edu.upc.service.ITPlanService;

@Named
@RequestScoped
public class TPlanController implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Inject
	private ITPlanService mService;
	private TPlan tplan;
	List<TPlan> listaTPlanes;
	
	@PostConstruct
	public void init() {
		this.listaTPlanes = new ArrayList<TPlan>();
		this.tplan = new TPlan();
		this.listar();
	}
	
	public String nuevoTPlan() {
		this.setTPlan(new TPlan());
		return "tplan.xhtml";
	}
	
	public void insertar() {
		mService.insertar(tplan);
		limpiarTPlan();
	}
	
	public void listar() {
		listaTPlanes = mService.listar();
	}
	
	public void limpiarTPlan() {
		this.init();
	}
	
	public void eliminar(TPlan tplan) {
		mService.eliminar(tplan.getIdTPlan());
		this.listar();
	}

	public TPlan getTPlan() {
		return tplan;
	}

	public void setTPlan(TPlan plan) {
		this.tplan = plan;
	}

	public List<TPlan> getListaTPlanes() {
		return listaTPlanes;
	}

	public void setListaTPlanes(List<TPlan> listaTPlanes) {
		this.listaTPlanes = listaTPlanes;
	}

	

}
