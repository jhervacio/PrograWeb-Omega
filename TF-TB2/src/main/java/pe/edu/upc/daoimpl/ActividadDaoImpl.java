package pe.edu.upc.daoimpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IActividadDao;
import pe.edu.upc.entity.Actividad;

public class ActividadDaoImpl implements IActividadDao, Serializable{
private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Actividad actividad) {
		em.persist(actividad);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Actividad> listar() {
		List<Actividad> lista = new ArrayList<Actividad>();
		Query q =em.createQuery("select a from Actividad a");
		lista = (List<Actividad>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idActividad) {
		Actividad actividad = new Actividad();
		actividad = em.getReference(Actividad.class, idActividad);
		em.remove(actividad);
		
	}
	//

}
