package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IAlimentacionClienteDao;
import pe.edu.upc.entity.AlimentacionCliente;
import pe.edu.upc.service.IAlimentacionClienteService;

@Named
@RequestScoped
public class AlimentacionClienteServiceImpl implements IAlimentacionClienteService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IAlimentacionClienteDao mD;
	
	@Override
	public void insertar(AlimentacionCliente alimentacioncliente) {
		mD.insertar(alimentacioncliente);
	}
	
	@Override
	public List<AlimentacionCliente> listar() {
		return mD.listar();
	}
	
	@Override
	public void eliminar(int idAlimentacionCliente) {
		mD.eliminar(idAlimentacionCliente);
	}



}
