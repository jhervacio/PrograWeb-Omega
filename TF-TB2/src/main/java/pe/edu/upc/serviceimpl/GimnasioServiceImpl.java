package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IGimnasioDao;
import pe.edu.upc.entity.Gimnasio;
import pe.edu.upc.service.IGimnasioService;

@Named
@RequestScoped
public class GimnasioServiceImpl implements IGimnasioService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IGimnasioDao mD;
	
	@Override
	public void insertar(Gimnasio gimnasio) {
		mD.insertar(gimnasio);
	}
	
	@Override
	public List<Gimnasio> listar() {
		return mD.listar();
	}
	
	@Override
	public void eliminar(int idGimnasio) {
		mD.eliminar(idGimnasio);
	}



}
