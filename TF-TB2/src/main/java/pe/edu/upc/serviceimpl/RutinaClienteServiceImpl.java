package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IRutinaClienteDao;
import pe.edu.upc.entity.RutinaCliente;
import pe.edu.upc.service.IRutinaClienteService;

@Named
@RequestScoped
public class RutinaClienteServiceImpl implements IRutinaClienteService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IRutinaClienteDao mD;
	
	@Override
	public void insertar(RutinaCliente rutinacliente) {
		mD.insertar(rutinacliente);
	}
	
	@Override
	public List<RutinaCliente> listar() {
		return mD.listar();
	}
	
	@Override
	public void eliminar(int idRutinaCliente) {
		mD.eliminar(idRutinaCliente);
	}



}
