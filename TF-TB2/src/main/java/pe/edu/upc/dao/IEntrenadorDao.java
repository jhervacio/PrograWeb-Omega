package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Entrenador;

public interface IEntrenadorDao {
	public void insertar(Entrenador Entrenador);
	public List<Entrenador> listar();
	public void eliminar(int idEntrenador);
}
