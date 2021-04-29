package pe.edu.upc.daoimpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IRutinaDao;
import pe.edu.upc.entity.Rutina;

public class RutinaDaoImpl implements IRutinaDao, Serializable{
private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Rutina rutina) {
		em.persist(rutina);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Rutina> listar() {
		List<Rutina> lista = new ArrayList<Rutina>();
		Query q =em.createQuery("select r from Rutina r");
		lista = (List<Rutina>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idRutina) {
		Rutina rutina = new Rutina();
		rutina = em.getReference(Rutina.class, idRutina);
		em.remove(rutina);
		
	}
	

}
