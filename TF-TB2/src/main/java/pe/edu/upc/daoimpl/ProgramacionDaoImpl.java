package pe.edu.upc.daoimpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IProgramacionDao;
import pe.edu.upc.entity.Programacion;

public class ProgramacionDaoImpl implements IProgramacionDao, Serializable{
private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Programacion programacion) {
		em.persist(programacion);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Programacion> listar() {
		List<Programacion> lista = new ArrayList<Programacion>();
		Query q =em.createQuery("select p from Programacion p");
		lista = (List<Programacion>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idProgramacion) {
		Programacion programacion = new Programacion();
		programacion = em.getReference(Programacion.class, idProgramacion);
		em.remove(programacion);
		
	}
	

}
