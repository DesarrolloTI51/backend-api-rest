package com.castores.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.castores.springboot.backend.apirest.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
	public Usuario findByUsername(String username);
}
