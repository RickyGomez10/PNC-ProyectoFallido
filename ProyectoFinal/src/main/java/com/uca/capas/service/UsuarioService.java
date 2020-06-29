package com.uca.capas.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Usuario;

public interface UsuarioService {
	
	public Usuario findUsuarioById(String codigo) throws Exception;
	
	public List<Usuario> findAll() throws DataAccessException;
	
	public Usuario findOne(String codigo) throws DataAccessException;
	
	public void insertar(Usuario usuario) throws DataAccessException;
	
	public void eliminar(String codigo) throws DataAccessException;


}
