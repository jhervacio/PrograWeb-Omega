package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Gimnasio;

public interface IGimnasioDao {
	public void insertar(Gimnasio Gimnasio);
	public List<Gimnasio> listar();
	public void eliminar(int idGimnasio);
}
