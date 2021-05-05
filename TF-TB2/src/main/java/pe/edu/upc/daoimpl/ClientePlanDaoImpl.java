package pe.edu.upc.daoimpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IClientePlanDao;
import pe.edu.upc.entity.ClientePlan;

public class ClientePlanDaoImpl implements IClientePlanDao, Serializable{
private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(ClientePlan clienteplan) {
		
		try {
			em.persist(clienteplan);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ClientePlan> listar() {
		List<ClientePlan> lista = new ArrayList<ClientePlan>();
		try {
		Query q =em.createQuery("select cp from ClientePlan cp");
		lista = (List<ClientePlan>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idClientePlan) {		
		ClientePlan cp = new ClientePlan();
		try {
			cp = em.getReference(ClientePlan.class, idClientePlan);
			em.remove(cp);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	

}
