package com.example.renatoCRUDRest.repository;

import com.example.renatoCRUDRest.model.MecModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MecRepository extends JpaRepository<MecModel, Long> {
}
