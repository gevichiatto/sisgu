package com.gevichiatto.sisgu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.gevichiatto.sisgu.entity.Perfis;
import com.gevichiatto.sisgu.repository.PerfisRepository;

@Component
public class PerfisService {
	
	private PerfisRepository perfisRepository;

    public PerfisService(PerfisRepository perfisRepository) {
        this.perfisRepository = perfisRepository;
    }

    public List<Perfis> getPerfis() {
        return perfisRepository.findAll();
    }
    
    public Perfis savePerfil(Perfis perfis) {
    	return perfisRepository.save(perfis);
    }

    public Perfis updatePerfil(Perfis perfis) {
        Optional<Perfis> atualizavel = perfisRepository.findById(perfis.getId());
        return perfisRepository.save(perfis);
    }
}