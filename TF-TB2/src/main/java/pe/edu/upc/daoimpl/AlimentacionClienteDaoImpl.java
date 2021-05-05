package pe.edu.upc.daoimpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IAlimentacionClienteDao;
import pe.edu.upc.entity.AlimentacionCliente;

public class AlimentacionClienteDaoImpl implements IAlimentacionClienteDao, Serializable{
private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(AlimentacionCliente alimentacioncliente) {
		em.persist(alimentacioncliente);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<AlimentacionCliente> listar() {
		List<AlimentacionCliente> lista = new ArrayList<AlimentacionCliente>();
		Query q =em.createQuery("select ac from AlimentacionCliente ac");
		lista = (List<AlimentacionCliente>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idAlimentacionCliente) {
		AlimentacionCliente alimentacioncliente = new AlimentacionCliente();
		alimentacioncliente = em.getReference(AlimentacionCliente.class, idAlimentacionCliente);
		em.remove(alimentacioncliente);
		
	}
	//

}
