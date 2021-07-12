package com.controlevacina.controlevacinaapi.controller;

import com.controlevacina.controlevacinaapi.model.Usuario;
import com.controlevacina.controlevacinaapi.model.Vacina;
import com.controlevacina.controlevacinaapi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CadastroController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/cadastro")
    public ResponseEntity cadastra(@RequestBody Usuario usuario) {
        Usuario usuarioSaved = usuarioService.create(usuario);
        if (usuarioSaved == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.created(URI.create("/usuario")).build();

    }
    @GetMapping("/consulta")
    public List<Usuario> listaUsuario(Usuario usuario){
        return usuarioService.findAll(usuario);
    }

    @GetMapping("/consulta/{id}")
    public Optional<Usuario> usuarioUnico(@PathVariable(value = "id") Long id){
        return usuarioService.findById(id);
    }

    @PutMapping("/atualiza")
    public Usuario atualizaUsuario(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @DeleteMapping("/deleta")
    public void deletaUsuario(@RequestBody Usuario usuario){
        usuarioService.delete(usuario);
    }

}



