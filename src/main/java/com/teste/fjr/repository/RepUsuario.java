package com.teste.fjr.repository;

import com.teste.fjr.entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepUsuario extends JpaRepository<Usuario, Long>{
    
}
