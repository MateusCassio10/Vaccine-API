package com.controlevacina.controlevacinaapi.controller;

import com.controlevacina.controlevacinaapi.model.Usuario;
import com.controlevacina.controlevacinaapi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity cadastra(@RequestBody Usuario usuario) {
        Usuario usuarioSaved = usuarioService.create(usuario);
        if (usuarioSaved == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.created(URI.create("/usuario")).build();
    }
}



