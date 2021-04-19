package com.controlevacina.controlevacinaapi.repository;

import com.controlevacina.controlevacinaapi.model.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacinaRepository extends JpaRepository<Vacina , Long> {
}
