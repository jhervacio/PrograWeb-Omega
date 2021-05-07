


package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.ActividadCliente;
import pe.edu.upc.service.IActividadClienteService;

import pe.edu.upc.entity.Actividad;
import pe.edu.upc.service.IActividadService;

import pe.edu.upc.entity.Cliente;
import pe.edu.upc.service.IClienteService;

@Named
@RequestScoped
public class ActividadClienteController4 implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Inject
	private IActividadClienteService aclService;
	
	@Inject
	private IActividadService aService;
	
	
	@Inject
	private IClienteService cService;
	
	
	
	private ActividadCliente actividadcliente ;
	List<ActividadCliente> listaActividadClientes;
	
	
	
	private Actividad actividad ;
	List<Actividad> listaActividades;
	
	private Cliente cliente ;
	List<Cliente> listaClientes;
	
	
	
	
	
	@PostConstruct
	public void init() {
		this.listaActividadClientes = new ArrayList<ActividadCliente>();
		this.actividadcliente = new ActividadCliente();
		
		this.listaActividades = new ArrayList<Actividad>();
		this.actividad = new Actividad();
		
		this.listaClientes = new ArrayList<Cliente>();
		this.cliente = new Cliente();
		
		this.listActividadCliente();

		this.listActividad();
		
		this.listCliente();
		
	}
	
	public String nuevoActividadCliente() {
		this.setActividadcliente(new ActividadCliente());
		return "actividadcliente.xhtml";
	}
	
	public void insertar() {
		aclService.insertar(actividadcliente);
		limpiarActividadCliente();
		this.listActividadCliente();
	}
	
	public void listActividadCliente() {
		listaActividadClientes = aclService.listar();
	}
	
	public void listActividad() {
		listaActividades = aService.listar();
	}
	
	
	public void listCliente() {
		listaClientes = cService.listar();
	}
	
	
	public void limpiarActividadCliente() {
		this.init();
	}
	
	public void eliminar(ActividadCliente actividadcliente) {
		aclService.eliminar(actividadcliente.getIdActividadCliente());
		this.listActividadCliente();
	}

	public ActividadCliente getActividadcliente() {
		return actividadcliente;
	}

	public void setActividadcliente(ActividadCliente actividadcliente) {
		this.actividadcliente = actividadcliente;
	}

	public List<ActividadCliente> getListaActividadClientes() {
		return listaActividadClientes;
	}

	public void setListaActividadClientes(List<ActividadCliente> listaActividadClientes) {
		this.listaActividadClientes = listaActividadClientes;
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public List<Actividad> getListaActividades() {
		return listaActividades;
	}

	public void setListaActividades(List<Actividad> listaActividades) {
		this.listaActividades = listaActividades;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	
	//
	
	
	
	
	

}