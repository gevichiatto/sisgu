package com.gevichiatto.sisgu.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.gevichiatto.sisgu.entity.Cargos;
import com.gevichiatto.sisgu.repository.CargosRepository;

@Component
public class CargosService {
	
	private CargosRepository cargosRepository;

    public CargosService(CargosRepository cargosRepository) {
        this.cargosRepository = cargosRepository;
    }

    public List<Cargos> getCargos() {
        return cargosRepository.findAll();
    }
    
    public Cargos saveCargo(Cargos cargos) {
        System.out.println(cargos);
    	return cargosRepository.save(cargos);
    }

}