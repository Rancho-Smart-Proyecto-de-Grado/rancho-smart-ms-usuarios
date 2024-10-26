package com.rancho_smart.ms_usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rancho_smart.ms_usuario.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
