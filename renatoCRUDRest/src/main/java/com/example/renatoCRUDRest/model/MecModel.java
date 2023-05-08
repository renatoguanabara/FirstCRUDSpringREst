package com.example.renatoCRUDRest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import com.example.renatoCRUDRest.service.MecRequestDTO;


@Table(name = "carros")
@Entity(name = "carros")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class MecModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private Integer ano;
    private String image;

    public MecModel(MecRequestDTO mec){
        this.marca = mec.marca();
        this.ano = mec.ano();
        this.image = mec.image();
    }




}
