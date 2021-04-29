package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IEntrenadorDao;
import pe.edu.upc.entity.Entrenador;
import pe.edu.upc.service.IEntrenadorService;

@Named
@RequestScoped
public class EntrenadorServiceImpl implements IEntrenadorService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IEntrenadorDao mD;
	
	@Override
	public void insertar(Entrenador entrenador) {
		mD.insertar(entrenador);
	}
	
	@Override
	public List<Entrenador> listar() {
		return mD.listar();
	}
	
	@Override
	public void eliminar(int idEntrenador) {
		mD.eliminar(idEntrenador);
	}



}
