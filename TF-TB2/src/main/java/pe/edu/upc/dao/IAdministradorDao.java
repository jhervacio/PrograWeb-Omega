package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Administrador;

public interface IAdministradorDao {
	public void insertar(Administrador Administrador);
	public List<Administrador> listar();
	public void eliminar(int idAdministrador);
}
