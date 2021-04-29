package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.EstadoSalud;

public interface IEstadoSaludService {
	public void insertar(EstadoSalud estadoSalud);
	public List<EstadoSalud> listar();
	public void eliminar(int idEstadoSalud);

}
