package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Gimnasio;

public interface IGimnasioService {
	public void insertar(Gimnasio gimnasio);
	public List<Gimnasio> listar();
	public void eliminar(int idGimnasio);

}
