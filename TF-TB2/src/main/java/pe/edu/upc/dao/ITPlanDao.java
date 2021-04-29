package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.TPlan;

public interface ITPlanDao {
	public void insertar(TPlan TPlan);
	public List<TPlan> listar();
	public void eliminar(int idTPlan);
}
