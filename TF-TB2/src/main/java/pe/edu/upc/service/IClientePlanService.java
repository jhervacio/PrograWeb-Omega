package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.ClientePlan;

public interface IClientePlanService {
	public void insertar(ClientePlan clienteplan);
	public List<ClientePlan> listar();
	public void eliminar(int idClientePlan);

}
