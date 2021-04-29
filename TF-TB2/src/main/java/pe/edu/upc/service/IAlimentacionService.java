package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Alimentacion;

public interface IAlimentacionService {
	public void insertar(Alimentacion alimentacion);
	public List<Alimentacion> listar();
	public void eliminar(int idAlimentacion);

}
