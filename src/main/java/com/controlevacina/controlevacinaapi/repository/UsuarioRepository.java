package com.controlevacina.controlevacinaapi.repository;

import com.controlevacina.controlevacinaapi.model.Usuario;
import com.controlevacina.controlevacinaapi.model.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}

