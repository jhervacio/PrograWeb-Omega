package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Rutina;
import pe.edu.upc.entity.Cliente;

import pe.edu.upc.service.IRutinaService;
import pe.edu.upc.service.IClienteService;

@Named
@RequestScoped
public class RutinaController implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Inject
	private IRutinaService rService;
	
	@Inject 
	private IClienteService cService;
	
	private Cliente cliente;
	private Rutina rutina;
	
	List<Rutina> listaRutinas;
	List<Cliente> listaClientes;
	
	@PostConstruct
	public void init() {
		this.listaRutinas = new ArrayList<Rutina>();
		this.listaClientes = new ArrayList<Cliente>();
		this.rutina = new Rutina();
		this.cliente = new Cliente();
		this.listar();
		this.listRutina();
	}
	
	public String nuevoRutina() {
		this.setRutina(new Rutina());
		return "rutina.xhtml";
	}
	
	public void insertar() {
		try {
		rService.insertar(rutina);
		limpiarRutina();
		this.listRutina();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void listar() {
		try {
			listaClientes = cService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void listRutina() {
		try {
			listaRutinas = rService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarRutina() {
		this.init();
	}
	
	public void eliminar(Rutina rutina) {
		try {
			rService.eliminar(rutina.getIdRutina());
			this.listRutina();
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

	public Rutina getRutina() {
		return rutina;
	}
	
	public void setRutina(Rutina rutina) {
		this.rutina = rutina;
	}

	
	
	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public List<Rutina> getListaRutinas() {
		return listaRutinas;
	}

	public void setListaRutinas(List<Rutina> listaRutinas) {
		this.listaRutinas = listaRutinas;
	}

	

}
