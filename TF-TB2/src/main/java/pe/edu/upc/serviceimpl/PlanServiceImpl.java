package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPlanDao;
import pe.edu.upc.entity.Plan;
import pe.edu.upc.service.IPlanService;

@Named
@RequestScoped
public class PlanServiceImpl implements IPlanService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPlanDao mD;
	
	@Override
	public void insertar(Plan plan) {
		mD.insertar(plan);
	}
	
	@Override
	public List<Plan> listar() {
		return mD.listar();
	}
	
	@Override
	public void eliminar(int idPlan) {
		mD.eliminar(idPlan);
	}



}
