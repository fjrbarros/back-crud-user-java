package com.teste.fjr.controller;

import com.teste.fjr.entity.Usuario;
import com.teste.fjr.service.ServUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario")
public class CtrUsuario {
    @Autowired
    private ServUsuario servUsuario;

    @PostMapping("/cadastro")
    public Usuario salvarUsuario(@RequestBody Usuario usuario) {
        return servUsuario.salvarUsuario(usuario);
    }
}
