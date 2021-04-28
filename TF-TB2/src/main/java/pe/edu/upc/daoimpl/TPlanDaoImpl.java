package pe.edu.upc.daoimpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITPlanDao;
import pe.edu.upc.entity.TPlan;

public class TPlanDaoImpl implements ITPlanDao, Serializable{
private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(TPlan tplan) {
		em.persist(tplan);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<TPlan> listar() {
		List<TPlan> lista = new ArrayList<TPlan>();
		Query q =em.createQuery("select p from TPlan p");
		lista = (List<TPlan>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idTPlan) {
		TPlan tplan = new TPlan();
		tplan = em.getReference(TPlan.class, idTPlan);
		em.remove(tplan);
		
	}
	

}
