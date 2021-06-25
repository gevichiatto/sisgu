package com.gevichiatto.sisgu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gevichiatto.sisgu.entity.Cargos;
import com.gevichiatto.sisgu.links.CargoLinks;
import com.gevichiatto.sisgu.service.CargosService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/")
public class CargosController {
	
	@Autowired
	CargosService cargosService;
	
	@GetMapping(path = CargoLinks.LIST_CARGOS)
    public ResponseEntity<?> listCargos() {
        // log.info("CargosController:  list cargos");
        List<Cargos> resource = cargosService.getCargos();
        return ResponseEntity.ok(resource);
    }
	
	@PostMapping(path = CargoLinks.ADD_CARGO)
	public ResponseEntity<?> saveCargo(@RequestBody Cargos cargo) {
        //log.info("CargosController:  list cargos");
        System.out.println("Obj cargo: " + cargo);
        Cargos resource = cargosService.saveCargo(cargo);
        return ResponseEntity.ok(resource);
    }
}
