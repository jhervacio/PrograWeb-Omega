package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.ActividadCliente;

public interface IActividadClienteService {
	public void insertar(ActividadCliente actividadcliente);
	public List<ActividadCliente> listar();
	public void eliminar(int idActividadCliente);

}
