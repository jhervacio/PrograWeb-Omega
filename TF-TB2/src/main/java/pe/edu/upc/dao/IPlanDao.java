package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Plan;

public interface IPlanDao {
	public void insertar(Plan Plan);
	public List<Plan> listar();
	public void eliminar(int idPlan);
}
