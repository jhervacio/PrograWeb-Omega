package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IDocumentoDao;
import pe.edu.upc.entity.Documento;
import pe.edu.upc.service.IDocumentoService;

@Named
@RequestScoped
public class DocumentoServiceImpl implements IDocumentoService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IDocumentoDao dD;
	
	@Override
	public void insertar(Documento documento) {
		dD.insertar(documento);
	}
	
	@Override
	public List<Documento> listar() {
		return dD.listar();
	}
	
	@Override
	public void eliminar(int idDocumento) {
		dD.eliminar(idDocumento);
	}



}
