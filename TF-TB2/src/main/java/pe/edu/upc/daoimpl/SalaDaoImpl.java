package pe.edu.upc.daoimpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ISalaDao;
import pe.edu.upc.entity.Sala;


public class SalaDaoImpl implements ISalaDao, Serializable{
private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Sala sala) {
		em.persist(sala);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Sala> listar() {
		List<Sala> lista = new ArrayList<Sala>();
		Query q =em.createQuery("select s from Sala s");
		lista = (List<Sala>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idSala) {
		Sala sala = new Sala();
		sala = em.getReference(Sala.class, idSala);
		em.remove(sala);
		
	}
	

}
