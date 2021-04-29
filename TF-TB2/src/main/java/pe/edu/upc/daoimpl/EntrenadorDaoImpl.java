package pe.edu.upc.daoimpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IEntrenadorDao;
import pe.edu.upc.entity.Entrenador;

public class EntrenadorDaoImpl implements IEntrenadorDao, Serializable{
private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Entrenador entrenador) {
		em.persist(entrenador);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Entrenador> listar() {
		List<Entrenador> lista = new ArrayList<Entrenador>();
		Query q =em.createQuery("select entr from Entrenador entr");
		lista = (List<Entrenador>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idEntrenador) {
		Entrenador entrenador = new Entrenador();
		entrenador = em.getReference(Entrenador.class, idEntrenador);
		em.remove(entrenador);
		
	}
	

}
