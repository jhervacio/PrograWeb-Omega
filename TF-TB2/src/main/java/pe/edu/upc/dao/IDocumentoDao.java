package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Documento;

public interface IDocumentoDao {
	public void insertar(Documento Documento);
	public List<Documento> listar();
	public void eliminar(int idDocumento);
}
