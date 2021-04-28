package pe.edu.upc.daoimpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPlanDao;
import pe.edu.upc.entity.Plan;

public class PlanDaoImpl implements IPlanDao, Serializable{
private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Plan plan) {
		em.persist(plan);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Plan> listar() {
		List<Plan> lista = new ArrayList<Plan>();
		Query q =em.createQuery("select p from Plan p");
		lista = (List<Plan>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idPlan) {
		Plan plan = new Plan();
		plan = em.getReference(Plan.class, idPlan);
		em.remove(plan);
		
	}
	

}
