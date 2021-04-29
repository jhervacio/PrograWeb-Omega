package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IActividadDao;
import pe.edu.upc.entity.Actividad;
import pe.edu.upc.service.IActividadService;

@Named
@RequestScoped
public class ActividadServiceImpl implements IActividadService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IActividadDao mD;
	
	@Override
	public void insertar(Actividad actividad) {
		mD.insertar(actividad);
	}
	
	@Override
	public List<Actividad> listar() {
		return mD.listar();
	}
	
	@Override
	public void eliminar(int idActividad) {
		mD.eliminar(idActividad);
	}



}
