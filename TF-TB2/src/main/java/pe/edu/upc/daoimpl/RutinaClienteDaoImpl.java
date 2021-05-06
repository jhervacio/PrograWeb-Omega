package pe.edu.upc.daoimpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IRutinaClienteDao;
import pe.edu.upc.entity.RutinaCliente;

public class RutinaClienteDaoImpl implements IRutinaClienteDao, Serializable{
private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(RutinaCliente rutinacliente) {
		em.persist(rutinacliente);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<RutinaCliente> listar() {
		List<RutinaCliente> lista = new ArrayList<RutinaCliente>();
		Query q =em.createQuery("select rc from RutinaCliente rc");
		lista = (List<RutinaCliente>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idRutinaCliente) {
		RutinaCliente rutinacliente = new RutinaCliente();
		rutinacliente = em.getReference(RutinaCliente.class, idRutinaCliente);
		em.remove(rutinacliente);
		
	}
	//

}
