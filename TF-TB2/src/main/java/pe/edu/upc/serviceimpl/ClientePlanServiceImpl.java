package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IClientePlanDao;
import pe.edu.upc.entity.ClientePlan;
import pe.edu.upc.service.IClientePlanService;

@Named
@RequestScoped
public class ClientePlanServiceImpl implements IClientePlanService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IClientePlanDao mD;
	
	@Override
	public void insertar(ClientePlan clienteplan) {
		mD.insertar(clienteplan);
	}
	
	@Override
	public List<ClientePlan> listar() {
		return mD.listar();
	}
	
	@Override
	public void eliminar(int idClientePlan) {
		mD.eliminar(idClientePlan);
	}



}
