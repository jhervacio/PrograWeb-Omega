package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Programacion;

public interface IProgramacionService {
	public void insertar(Programacion programacion);
	public List<Programacion> listar();
	public void eliminar(int idProgramacion);

}
