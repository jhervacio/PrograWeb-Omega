package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Sala;

public interface ISalaDao {
	public void insertar(Sala Sala);
	public List<Sala> listar();
	public void eliminar(int idSala);
}
