package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Rutina;

public interface IRutinaDao {
	public void insertar(Rutina Rutina);
	public List<Rutina> listar();
	public void eliminar(int idRutina);
}
