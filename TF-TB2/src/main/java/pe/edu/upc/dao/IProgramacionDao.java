package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Programacion;

public interface IProgramacionDao {
	public void insertar(Programacion Programacion);
	public List<Programacion> listar();
	public void eliminar(int idProgramacion);
}
