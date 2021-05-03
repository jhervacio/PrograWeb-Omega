package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.AlimentacionCliente;

public interface IAlimentacionClienteDao {
	public void insertar(AlimentacionCliente alimentacioncliente);
	public List<AlimentacionCliente> listar();
	public void eliminar(int idAlimentacionCliente);
}
