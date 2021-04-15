package com.teste.fjr.service;

import com.teste.fjr.entity.Usuario;
import com.teste.fjr.repository.RepUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServUsuario {
    @Autowired
    private RepUsuario repUsuario;

    public Usuario salvarUsuario(Usuario usuario) {
        return repUsuario.saveAndFlush(usuario);
    }
}
