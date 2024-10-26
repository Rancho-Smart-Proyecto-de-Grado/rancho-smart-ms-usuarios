package com.rancho_smart.ms_usuario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rancho_smart.ms_usuario.entity.Usuario;
import com.rancho_smart.ms_usuario.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getUsuarios() {
        return this.usuarioRepository.findAll();
    }

    public Optional<Usuario> getUsuarioById(Long id) {
        return this.usuarioRepository.findById(id);
    }

    public Usuario saveUsuario(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

    public void deleteUsuario(Long id) {
        this.usuarioRepository.deleteById(id);
    }
}
