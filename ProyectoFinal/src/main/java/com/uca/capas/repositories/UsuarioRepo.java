package com.uca.capas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.uca.capas.domain.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario, Integer> {
	
	@Query(value = "SELECT * from public.usuario where usuario = ':usuario'", nativeQuery = true)
    public Usuario findUsuarioById(@Param("usuario") String usuario);
	

}
