package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IAlimentacionDao;
import pe.edu.upc.entity.Alimentacion;
import pe.edu.upc.service.IAlimentacionService;

@Named
@RequestScoped
public class AlimentacionServiceImpl implements IAlimentacionService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IAlimentacionDao aD;
	
	@Override
	public void insertar(Alimentacion alimentacion) {
		aD.insertar(alimentacion);
	}
	
	@Override
	public List<Alimentacion> listar() {
		return aD.listar();
	}
	
	@Override
	public void eliminar(int idAlimentacion) {
		aD.eliminar(idAlimentacion);
	}



}
