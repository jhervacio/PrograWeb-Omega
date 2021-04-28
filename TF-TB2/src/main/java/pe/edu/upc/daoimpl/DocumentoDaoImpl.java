package pe.edu.upc.daoimpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDocumentoDao;
import pe.edu.upc.entity.Documento;

public class DocumentoDaoImpl implements IDocumentoDao, Serializable{
private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Documento documento) {
		em.persist(documento);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Documento> listar() {
		List<Documento> lista = new ArrayList<Documento>();
		Query q =em.createQuery("select d from Documento d");
		lista = (List<Documento>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idDocumento) {
		Documento documento = new Documento();
		documento = em.getReference(Documento.class, idDocumento);
		em.remove(documento);
		
	}
	

}
