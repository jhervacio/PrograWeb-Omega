package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ISalaDao;
import pe.edu.upc.entity.Sala;
import pe.edu.upc.service.ISalaService;

@Named
@RequestScoped
public class SalaServiceImpl implements ISalaService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ISalaDao mD;
	
	@Override
	public void insertar(Sala sala) {
		mD.insertar(sala);
	}
	
	@Override
	public List<Sala> listar() {
		return mD.listar();
	}
	
	@Override
	public void eliminar(int idSala) {
		mD.eliminar(idSala);
	}



}
