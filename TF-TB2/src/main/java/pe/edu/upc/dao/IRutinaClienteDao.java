package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.RutinaCliente;

public interface IRutinaClienteDao {
	public void insertar(RutinaCliente rutinacliente);
	public List<RutinaCliente> listar();
	public void eliminar(int idRutinaCliente);
}
