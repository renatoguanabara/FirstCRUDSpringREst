package com.example.renatoCRUDRest.service;

import com.example.renatoCRUDRest.model.MecModel;


//Utilizado só para representar os dados
public record MecResponseDTO(Long id, String marca, Integer ano, String image) {
        public MecResponseDTO(MecModel mecModel){
            this(mecModel.getId(),mecModel.getMarca(), mecModel.getAno(), mecModel.getImage());
    }
}
