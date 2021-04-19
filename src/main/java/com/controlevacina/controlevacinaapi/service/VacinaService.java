package com.controlevacina.controlevacinaapi.service;

import com.controlevacina.controlevacinaapi.model.Vacina;
import com.controlevacina.controlevacinaapi.repository.VacinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class VacinaService {

    @Autowired
    VacinaRepository vacinaRepository;

    public Vacina create(Vacina vacina){
        try{
            return vacinaRepository.save(vacina);
        } catch (DataIntegrityViolationException e){
            return null;
        }
    }

}
