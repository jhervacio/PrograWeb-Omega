package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IAdministradorDao;
import pe.edu.upc.entity.Administrador;
import pe.edu.upc.service.IAdministradorService;

@Named
@RequestScoped
public class AdministradorServiceImpl implements IAdministradorService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IAdministradorDao mD;
	
	@Override
	public void insertar(Administrador administrador) {
		mD.insertar(administrador);
	}
	
	@Override
	public List<Administrador> listar() {
		return mD.listar();
	}
	
	@Override
	public void eliminar(int idAdministrador) {
		mD.eliminar(idAdministrador);
	}



}
