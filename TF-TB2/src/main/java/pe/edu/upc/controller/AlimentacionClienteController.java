package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.AlimentacionCliente;
import pe.edu.upc.service.IAlimentacionClienteService;

import pe.edu.upc.entity.Alimentacion;
import pe.edu.upc.service.IAlimentacionService;

import pe.edu.upc.entity.Cliente;
import pe.edu.upc.service.IClienteService;

@Named
@RequestScoped
public class AlimentacionClienteController implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Inject
	private IAlimentacionClienteService acService;
	
	@Inject
	private IAlimentacionService aService;
	
	
	@Inject
	private IClienteService cService;
	
	
	
	private AlimentacionCliente alimentacioncliente ;
	List<AlimentacionCliente> listaAlimentacionClientes;
	
	
	
	private Alimentacion alimentacion ;
	List<Alimentacion> listaAlimentaciones;
	
	private Cliente cliente ;
	List<Cliente> listaClientes;
	
	
	
	
	
	@PostConstruct
	public void init() {
		this.listaAlimentacionClientes = new ArrayList<AlimentacionCliente>();
		this.alimentacioncliente = new AlimentacionCliente();
		
		this.listaAlimentaciones = new ArrayList<Alimentacion>();
		this.alimentacion = new Alimentacion();
		
		this.listaClientes = new ArrayList<Cliente>();
		this.cliente = new Cliente();
		
		this.listAlimentacionCliente();

		this.listAlimentacion();
		
		this.listCliente();
		
	}
	
	public String nuevoAlimentacionCliente() {
		this.setAlimentacioncliente(new AlimentacionCliente());
		return "alimentacioncliente.xhtml";
	}
	
	public void insertar() {
		acService.insertar(alimentacioncliente);
		limpiarAlimentacionCliente();
		this.listAlimentacionCliente();
	}
	
	public void listAlimentacionCliente() {
		listaAlimentacionClientes = acService.listar();
	}
	
	public void listAlimentacion() {
		listaAlimentaciones = aService.listar();
	}
	
	
	public void listCliente() {
		listaClientes = cService.listar();
	}
	
	
	public void limpiarAlimentacionCliente() {
		this.init();
	}
	
	public void eliminar(AlimentacionCliente alimentacioncliente) {
		acService.eliminar(alimentacioncliente.getIdAlimentacionCliente());
		this.listAlimentacionCliente();
	}

	
	
	public AlimentacionCliente getAlimentacioncliente() {
		return alimentacioncliente;
	}

	public void setAlimentacioncliente(AlimentacionCliente alimentacioncliente) {
		this.alimentacioncliente = alimentacioncliente;
	}

	public List<AlimentacionCliente> getListaAlimentacionClientes() {
		return listaAlimentacionClientes;
	}

	public void setListaAlimentacionClientes(List<AlimentacionCliente> listaAlimentacionClientes) {
		this.listaAlimentacionClientes = listaAlimentacionClientes;
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

	
	
	

}