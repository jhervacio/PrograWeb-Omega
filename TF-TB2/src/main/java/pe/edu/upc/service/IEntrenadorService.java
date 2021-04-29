package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Entrenador;

public interface IEntrenadorService {
	public void insertar(Entrenador entrenador);
	public List<Entrenador> listar();
	public void eliminar(int idEntrenador);

}
