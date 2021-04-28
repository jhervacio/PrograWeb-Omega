package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IRutinaDao;
import pe.edu.upc.entity.Rutina;
import pe.edu.upc.service.IRutinaService;

@Named
@RequestScoped
public class RutinaServiceImpl implements IRutinaService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IRutinaDao rD;
	
	@Override
	public void insertar(Rutina rutina) {
		rD.insertar(rutina);
	}
	
	@Override
	public List<Rutina> listar() {
		return rD.listar();
	}
	
	@Override
	public void eliminar(int idRutina) {
		rD.eliminar(idRutina);
	}



}
