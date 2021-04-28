package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITPlanDao;
import pe.edu.upc.entity.TPlan;
import pe.edu.upc.service.ITPlanService;

@Named
@RequestScoped
public class TPlanServiceImpl implements ITPlanService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITPlanDao mD;
	
	@Override
	public void insertar(TPlan tplan) {
		mD.insertar(tplan);
	}
	
	@Override
	public List<TPlan> listar() {
		return mD.listar();
	}
	
	@Override
	public void eliminar(int idTPlan) {
		mD.eliminar(idTPlan);
	}



}
