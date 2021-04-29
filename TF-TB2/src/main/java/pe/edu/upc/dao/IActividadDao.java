package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Actividad;

public interface IActividadDao {
	public void insertar(Actividad Actividad);
	public List<Actividad> listar();
	public void eliminar(int idActividad);
}
