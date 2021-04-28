package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Documento;
import pe.edu.upc.service.IDocumentoService;

@Named
@RequestScoped
public class DocumentoController implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Inject
	private IDocumentoService rService;
	private Documento documento;
	List<Documento> listaDocumentos;
	
	@PostConstruct
	public void init() {
		this.listaDocumentos = new ArrayList<Documento>();
		this.documento = new Documento();
		this.listar();
	}
	
	public String nuevoDocumento() {
		this.setDocumento(new Documento());
		return "documento.xhtml";
	}
	
	public void insertar() {
		rService.insertar(documento);
		limpiarDocumento();
	}
	
	public void listar() {
		listaDocumentos = rService.listar();
	}
	
	public void limpiarDocumento() {
		this.init();
	}
	
	public void eliminar(Documento documento) {
		rService.eliminar(documento.getIdDocumento());
		this.listar();
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public List<Documento> getListaDocumentos() {
		return listaDocumentos;
	}

	public void setListaDocumentos(List<Documento> listaDocumentos) {
		this.listaDocumentos = listaDocumentos;
	}

	

}
