package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.RutinaCliente;

public interface IRutinaClienteService {
	public void insertar(RutinaCliente rutinacliente);
	public List<RutinaCliente> listar();
	public void eliminar(int idRutinaCliente);

}
