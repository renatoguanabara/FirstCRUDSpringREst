package com.example.renatoCRUDRest.controller;

import com.example.renatoCRUDRest.model.MecModel;
import com.example.renatoCRUDRest.repository.MecRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.renatoCRUDRest.service.MecRequestDTO;
import com.example.renatoCRUDRest.service.MecResponseDTO;

import java.util.List;

@RestController
@RequestMapping("carro")
public class MecController {

    @Autowired
    private MecRepository mecRepository;

    @PostMapping
    public void saveMec(@RequestBody MecRequestDTO data){
        MecModel mecData = new MecModel(data);
        mecRepository.save(mecData);
        return;
    }

    @DeleteMapping
    public void deleteCarAll(@RequestBody MecModel mecModel) {
            mecRepository.delete(mecModel);

    }

    @GetMapping
    public List<MecResponseDTO> getAll(){
        List<MecResponseDTO> mecList = mecRepository.findAll().stream().map(MecResponseDTO::new).toList();
        return mecList;
    }



    @PutMapping
    public MecModel updateDataCarById(@RequestBody MecModel mecModel){
        return mecRepository.save(mecModel);

    }
}
