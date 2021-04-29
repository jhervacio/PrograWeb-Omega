package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IEstadoSaludDao;
import pe.edu.upc.entity.EstadoSalud;
import pe.edu.upc.service.IEstadoSaludService;

@Named
@RequestScoped
public class EstadoSaludServiceImpl implements IEstadoSaludService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IEstadoSaludDao mD;
	
	@Override
	public void insertar(EstadoSalud estadoSalud) {
		mD.insertar(estadoSalud);
	}
	
	@Override
	public List<EstadoSalud> listar() {
		return mD.listar();
	}
	
	@Override
	public void eliminar(int idEstadoSalud) {
		mD.eliminar(idEstadoSalud);
	}



}
