package pe.edu.upc.daoimpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IAdministradorDao;
import pe.edu.upc.entity.Administrador;

public class AdministradorDaoImpl implements IAdministradorDao, Serializable{
private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Administrador administrador) {
		em.persist(administrador);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Administrador> listar() {
		List<Administrador> lista = new ArrayList<Administrador>();
		Query q =em.createQuery("select adm from Administrador adm");
		lista = (List<Administrador>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idAdministrador) {
		Administrador administrador = new Administrador();
		administrador = em.getReference(Administrador.class, idAdministrador);
		em.remove(administrador);
		
	}
	

}
