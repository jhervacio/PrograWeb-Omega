package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Alimentacion;

public interface IAlimentacionDao {
	public void insertar(Alimentacion Alimentacion);
	public List<Alimentacion> listar();
	public void eliminar(int idAlimentacion);
}
