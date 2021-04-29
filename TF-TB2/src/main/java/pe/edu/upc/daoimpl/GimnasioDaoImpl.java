package pe.edu.upc.daoimpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IGimnasioDao;
import pe.edu.upc.entity.Gimnasio;

public class GimnasioDaoImpl implements IGimnasioDao, Serializable{
private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Gimnasio gimnasio) {
		em.persist(gimnasio);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Gimnasio> listar() {
		List<Gimnasio> lista = new ArrayList<Gimnasio>();
		Query q =em.createQuery("select g from Gimnasio g");
		lista = (List<Gimnasio>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idGimnasio) {
		Gimnasio gimnasio = new Gimnasio();
		gimnasio = em.getReference(Gimnasio.class, idGimnasio);
		em.remove(gimnasio);
		
	}
	

}
