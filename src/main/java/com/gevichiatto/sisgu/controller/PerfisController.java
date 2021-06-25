package com.gevichiatto.sisgu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gevichiatto.sisgu.entity.Perfis;
import com.gevichiatto.sisgu.links.PerfilLinks;
import com.gevichiatto.sisgu.service.PerfisService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/")
public class PerfisController {
	
	@Autowired
	PerfisService perfisService;
	
	@GetMapping(path = PerfilLinks.LIST_PERFIS)
    public ResponseEntity<?> listPerfis() {
        // log.info("PerfisController:  list perfis");
        List<Perfis> resource = perfisService.getPerfis();
        return ResponseEntity.ok(resource);
    }
	
	@PostMapping(path = PerfilLinks.ADD_PERFIL)
	public ResponseEntity<?> savePerfil(@RequestBody Perfis perfil) {
        //log.info("PerfisController:  list perfis");
        System.out.println("Obj perfil: " + perfil);
        Perfis resource = perfisService.savePerfil(perfil);
        return ResponseEntity.ok(resource);
    }

	@PostMapping(path = PerfilLinks.EDIT_PERFIL)
	public ResponseEntity<?> updatePerfil(@RequestBody Perfis perfil) {
        //log.info("PerfisController:  list perfis");
        System.out.println("Obj perfil: " + perfil);
        Perfis resource = perfisService.updatePerfil(perfil);
        return ResponseEntity.ok(resource);
    }
}
