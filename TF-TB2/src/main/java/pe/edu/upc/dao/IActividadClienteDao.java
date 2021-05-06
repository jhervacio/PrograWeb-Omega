package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.ActividadCliente;

public interface IActividadClienteDao {
	public void insertar(ActividadCliente actividadcliente);
	public List<ActividadCliente> listar();
	public void eliminar(int idActividadCliente);
}
