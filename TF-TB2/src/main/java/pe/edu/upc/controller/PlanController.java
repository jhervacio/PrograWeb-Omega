package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Plan;
import pe.edu.upc.service.IPlanService;

@Named
@RequestScoped
public class PlanController implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Inject
	private IPlanService mService;
	private Plan plan;
	List<Plan> listaPlanes;
	
	@PostConstruct
	public void init() {
		this.listaPlanes = new ArrayList<Plan>();
		this.plan = new Plan();
		this.listar();
	}
	
	public String nuevoPlan() {
		this.setPlan(new Plan());
		return "plan.xhtml";
	}
	
	public void insertar() {
		mService.insertar(plan);
		limpiarPlan();
	}
	
	public void listar() {
		listaPlanes = mService.listar();
	}
	
	public void limpiarPlan() {
		this.init();
	}
	
	public void eliminar(Plan cliente) {
		mService.eliminar(cliente.getIdPlan());
		this.listar();
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan cliente) {
		this.plan = cliente;
	}

	public List<Plan> getListaPlanes() {
		return listaPlanes;
	}

	public void setListaPlanes(List<Plan> listaPlanes) {
		this.listaPlanes = listaPlanes;
	}

	

}
