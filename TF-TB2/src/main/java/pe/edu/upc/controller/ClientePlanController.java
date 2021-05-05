package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Cliente;
import pe.edu.upc.entity.Plan;
import pe.edu.upc.entity.ClientePlan;

import pe.edu.upc.service.IClienteService;
import pe.edu.upc.service.IPlanService;
import pe.edu.upc.service.IClientePlanService;

@Named
@RequestScoped
public class ClientePlanController implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Inject
	private IClienteService cService;
	
	@Inject
	private IPlanService pService;
	
	@Inject
	private IClientePlanService cpService;
	
	private Cliente cliente;
	private Plan plan;
	private ClientePlan clienteplan;
	
	List<Cliente> listaClientes;
	List<Plan> listaPlanes;
	List<ClientePlan> listaClientePlanes;
	
	@PostConstruct
	public void init() {
		cliente = new Cliente();
		plan = new Plan();
		clienteplan = new ClientePlan();
		
		listaClientes = new ArrayList<Cliente>();
		listaPlanes = new ArrayList<Plan>();
		listaClientePlanes = new ArrayList<ClientePlan>();
	
		this.listCliente();
		this.listPlan();
		this.listClientePlan();
		
	}
	
	public String nuevoClientePlan() {
		this.setClienteplan(new ClientePlan());
		return "clienteplan.xhtml";
	}
	
	public void insertar() {
		try {
			cpService.insertar(clienteplan);
			limpiarClientePlan();
			this.listClientePlan();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void listClientePlan() {
		try {
			listaClientePlanes = cpService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void listCliente() {
		try {
			listaClientes = cService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	public void listPlan() {
		try {
			listaPlanes = pService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void limpiarClientePlan() {
		this.init();
	}
	
	public void eliminar(ClientePlan clienteplan) {
		try {
			cpService.eliminar(clienteplan.getIdClientePlan());
			this.listClientePlan();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public ClientePlan getClienteplan() {
		return clienteplan;
	}

	public void setClienteplan(ClientePlan clienteplan) {
		this.clienteplan = clienteplan;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public List<Plan> getListaPlanes() {
		return listaPlanes;
	}

	public void setListaPlanes(List<Plan> listaPlanes) {
		this.listaPlanes = listaPlanes;
	}

	public List<ClientePlan> getListaClientePlanes() {
		return listaClientePlanes;
	}

	public void setListaClientePlanes(List<ClientePlan> listaClientePlanes) {
		this.listaClientePlanes = listaClientePlanes;
	}


	
}
