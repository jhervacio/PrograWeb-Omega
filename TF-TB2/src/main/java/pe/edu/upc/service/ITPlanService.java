package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.TPlan;

public interface ITPlanService {
	public void insertar(TPlan tplan);
	public List<TPlan> listar();
	public void eliminar(int idTPlan);

}
