package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Actividad;

public interface IActividadService {
	public void insertar(Actividad actividad);
	public List<Actividad> listar();
	public void eliminar(int idActividad);

}
