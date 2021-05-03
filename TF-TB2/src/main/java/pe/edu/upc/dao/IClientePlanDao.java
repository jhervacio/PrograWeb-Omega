package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.ClientePlan;

public interface IClientePlanDao {
	public void insertar(ClientePlan clienteplan);
	public List<ClientePlan> listar();
	public void eliminar(int idClientePlan);
}
