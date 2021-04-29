package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Documento;

public interface IDocumentoService {
	public void insertar(Documento documento);
	public List<Documento> listar();
	public void eliminar(int idRDocumento);

}
