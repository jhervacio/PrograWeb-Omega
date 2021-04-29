package pe.edu.upc.daoimpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IEstadoSaludDao;
import pe.edu.upc.entity.EstadoSalud;

public class EstadoSaludDaoImpl implements IEstadoSaludDao, Serializable{
private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(EstadoSalud estadoSalud) {
		em.persist(estadoSalud);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<EstadoSalud> listar() {
		List<EstadoSalud> lista = new ArrayList<EstadoSalud>();
		Query q =em.createQuery("select sal from EstadoSalud sal ");
		lista = (List<EstadoSalud>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idEstadoSalud) {
		EstadoSalud estadoSalud = new EstadoSalud();
		estadoSalud = em.getReference(EstadoSalud.class, idEstadoSalud);
		em.remove(estadoSalud);
		
	}
	

}
