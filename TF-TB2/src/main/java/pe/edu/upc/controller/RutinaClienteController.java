package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.RutinaCliente;
import pe.edu.upc.service.IRutinaClienteService;

import pe.edu.upc.entity.Rutina;
import pe.edu.upc.service.IRutinaService;

import pe.edu.upc.entity.Cliente;
import pe.edu.upc.service.IClienteService;

@Named
@RequestScoped
public class RutinaClienteController implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Inject
	private IRutinaClienteService rcService;
	
	@Inject
	private IRutinaService rService;
	
	
	@Inject
	private IClienteService cService;
	
	
	
	private RutinaCliente rutinacliente ;
	List<RutinaCliente> listaRutinaClientes;
	
	
	
	private Rutina rutina ;
	List<Rutina> listaRutinas;
	
	private Cliente cliente ;
	List<Cliente> listaClientes;
	
	
	
	
	
	@PostConstruct
	public void init() {
		this.listaRutinaClientes = new ArrayList<RutinaCliente>();
		this.rutinacliente = new RutinaCliente();
		
		this.listaRutinas = new ArrayList<Rutina>();
		this.rutina = new Rutina();
		
		this.listaClientes = new ArrayList<Cliente>();
		this.cliente = new Cliente();
		
		this.listRutinaCliente();

		this.listRutina();
		
		this.listCliente();
		
	}
	
	public String nuevoRutinaCliente() {
		this.setRutinacliente(new RutinaCliente());
		return "rutinacliente.xhtml";
	}
	
	public void insertar() {
		rcService.insertar(rutinacliente);
		limpiarRutinaCliente();
		this.listRutinaCliente();
	}
	
	public void listRutinaCliente() {
		listaRutinaClientes = rcService.listar();
	}
	
	public void listRutina() {
		listaRutinas = rService.listar();
	}
	
	
	public void listCliente() {
		listaClientes = cService.listar();
	}
	
	
	public void limpiarRutinaCliente() {
		this.init();
	}
	
	public void eliminar(RutinaCliente rutinacliente) {
		rcService.eliminar(rutinacliente.getIdRutinaCliente());
		this.listRutinaCliente();
	}


	public RutinaCliente getRutinacliente() {
		return rutinacliente;
	}

	public void setRutinacliente(RutinaCliente rutinacliente) {
		this.rutinacliente = rutinacliente;
	}

	public List<RutinaCliente> getListaRutinaClientes() {
		return listaRutinaClientes;
	}

	public void setListaRutinaClientes(List<RutinaCliente> listaRutinaClientes) {
		this.listaRutinaClientes = listaRutinaClientes;
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
