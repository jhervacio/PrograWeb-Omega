package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Cliente;

public interface IClienteDao {
	public void insertar(Cliente Cliente);
	public List<Cliente> listar();
	public void eliminar(int idCliente);
	public List<Cliente> findByNameCliente(Cliente c);
}
