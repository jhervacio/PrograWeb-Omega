package pe.edu.upc.daoimpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IAlimentacionDao;
import pe.edu.upc.entity.Alimentacion;

public class AlimentacionDaoImpl implements IAlimentacionDao, Serializable{
private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Alimentacion alimentacion) {
		em.persist(alimentacion);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Alimentacion> listar() {
		List<Alimentacion> lista = new ArrayList<Alimentacion>();
		Query q =em.createQuery("select al from Alimentacion al");
		lista = (List<Alimentacion>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idAlimentacion) {
		Alimentacion alimentacion = new Alimentacion();
		alimentacion = em.getReference(Alimentacion.class, idAlimentacion);
		em.remove(alimentacion);
		
	}
	

}
