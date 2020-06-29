package com.uca.capas.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Usuario;

public interface UsuarioDAO {
	public List<Usuario> findAll() throws DataAccessException;
	public Usuario findOne(Integer code) throws DataAccessException;
	public void insertar(Usuario usuario) throws DataAccessException;
}
