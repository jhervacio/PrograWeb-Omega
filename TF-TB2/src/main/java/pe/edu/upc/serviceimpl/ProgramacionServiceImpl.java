package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IProgramacionDao;
import pe.edu.upc.entity.Programacion;
import pe.edu.upc.service.IProgramacionService;

@Named
@RequestScoped
public class ProgramacionServiceImpl implements IProgramacionService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IProgramacionDao mD;
	
	@Override
	public void insertar(Programacion programacion) {
		mD.insertar(programacion);
	}
	
	@Override
	public List<Programacion> listar() {
		return mD.listar();
	}
	
	@Override
	public void eliminar(int idProgramacion) {
		mD.eliminar(idProgramacion);
	}



}
