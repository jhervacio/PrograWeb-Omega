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
		try {
			mService.insertar(tplan);
			limpiarTPlan();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void listar() {
		try {
			listaTPlanes = mService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void limpiarTPlan() {
		this.init();
	}
	
	public void eliminar(TPlan tplan) {
		try {
			mService.eliminar(tplan.getIdTPlan());
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public TPlan getTPlan() {
		return tplan;
	}

	public void setTPlan(TPlan tplan) {
		this.tplan = tplan;
	}

	public List<TPlan> getListaTPlanes() {
		return listaTPlanes;
	}

	public void setListaTPlanes(List<TPlan> listaTPlanes) {
		this.listaTPlanes = listaTPlanes;
	}

	

}
