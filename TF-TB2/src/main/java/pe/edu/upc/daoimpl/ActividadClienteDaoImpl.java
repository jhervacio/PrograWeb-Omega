package pe.edu.upc.daoimpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IActividadClienteDao;
import pe.edu.upc.entity.ActividadCliente;

public class ActividadClienteDaoImpl implements IActividadClienteDao, Serializable{
private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(ActividadCliente actividadcliente) {
		em.persist(actividadcliente);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ActividadCliente> listar() {
		List<ActividadCliente> lista = new ArrayList<ActividadCliente>();
		Query q =em.createQuery("select acl from ActividadCliente acl");
		lista = (List<ActividadCliente>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idActividadCliente) {
		ActividadCliente actividadcliente = new ActividadCliente();
		actividadcliente = em.getReference(ActividadCliente.class, idActividadCliente);
		em.remove(actividadcliente);
		
	}
	//

}
