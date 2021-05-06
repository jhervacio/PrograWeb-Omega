package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IActividadClienteDao;
import pe.edu.upc.entity.ActividadCliente;
import pe.edu.upc.service.IActividadClienteService;

@Named
@RequestScoped
public class ActividadClienteServiceImpl implements IActividadClienteService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IActividadClienteDao mD;
	
	@Override
	public void insertar(ActividadCliente actividadcliente) {
		mD.insertar(actividadcliente);
	}
	
	@Override
	public List<ActividadCliente> listar() {
		return mD.listar();
	}
	
	@Override
	public void eliminar(int idActividadCliente) {
		mD.eliminar(idActividadCliente);
	}



}
