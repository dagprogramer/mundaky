package com.sayqa.service;

import com.sayqa.model.Usuario;
import com.sayqa.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario getUser(Long id){
        return usuarioRepository.getOne(id);
    }


}
