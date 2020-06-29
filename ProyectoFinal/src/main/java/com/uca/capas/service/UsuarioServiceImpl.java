package com.uca.capas.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;


import com.uca.capas.domain.Usuario;

import com.uca.capas.repositories.UsuarioRepo;


@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioRepo usuarioRepo;
	
	public Usuario findUsuarioById(String codigo) throws DataAccessException {
		return usuarioRepo.findUsuarioById(codigo);
		
		
	}

	@Override
	public List<Usuario> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findOne(String codigo) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertar(Usuario usuario) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(String codigo) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

	

}
