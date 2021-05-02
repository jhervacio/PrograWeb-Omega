package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Plan;
import pe.edu.upc.entity.TPlan;

import pe.edu.upc.service.IPlanService;
import pe.edu.upc.service.ITPlanService;

@Named
@RequestScoped
public class PlanController implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Inject
	private IPlanService mService;
	
	@Inject
	private ITPlanService tpService;
	
	private Plan plan;
	private TPlan tplan;
	
	List<Plan> listaPlanes;
	List <TPlan> listaTPlanes;
	
	@PostConstruct
	public void init() {
		this.listaPlanes = new ArrayList<Plan>();
		this.listaTPlanes = new ArrayList<TPlan>();
		this.plan = new Plan();
		this.tplan = new TPlan();
		this.listar();
		this.listarTPlan();
	}
	
	public String nuevoPlan() {
		this.setPlan(new Plan());
		return "plan.xhtml";
	}
	
	public void insertar() {

		try {
			mService.insertar(plan);
			limpiarPlan();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void listar() {
	
		try {
			listaPlanes = mService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void listarTPlan() {
		try {
			listaTPlanes = tpService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarPlan() {
		this.init();
	}
	
	public void eliminar(Plan plan) {
		
		try {
			mService.eliminar(plan.getIdPlan());
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
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

	public ITPlanService getTpService() {
		return tpService;
	}

	public void setTpService(ITPlanService tpService) {
		this.tpService = tpService;
	}

	public TPlan getTplan() {
		return tplan;
	}

	public void setTplan(TPlan tplan) {
		this.tplan = tplan;
	}

	public List<TPlan> getListaTPlanes() {
		return listaTPlanes;
	}

	public void setListaTPlanes(List<TPlan> listaTPlanes) {
		this.listaTPlanes = listaTPlanes;
	}

	

}
