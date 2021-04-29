package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.EstadoSalud;

public interface IEstadoSaludDao {
	public void insertar(EstadoSalud EstadoSalud);
	public List<EstadoSalud> listar();
	public void eliminar(int idEstadoSalud);
}
