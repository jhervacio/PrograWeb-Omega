package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.AlimentacionCliente;

public interface IAlimentacionClienteService {
	public void insertar(AlimentacionCliente alimentacioncliente);
	public List<AlimentacionCliente> listar();
	public void eliminar(int idAlimentacionCliente);

}
