package com.controlevacina.controlevacinaapi.controller;

import com.controlevacina.controlevacinaapi.model.Vacina;
import com.controlevacina.controlevacinaapi.service.VacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/vacina")
public class VacinaController {

    @Autowired
    private VacinaService vacinaService;

    @PostMapping
    public ResponseEntity cadastroVacina(@RequestBody Vacina vacina){
        Vacina vacinaSaved = vacinaService.create(vacina);
        if(vacinaSaved == null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.created(URI.create("/vacina")).build();
    }
}
