package com.tareas.controller;


import com.tareas.model.Falabella;
import com.tareas.repository.FalabellaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class FalabellaController {

    public FalabellaController(FalabellaRepository repo) {
        this.repo = repo;
    }

    @Autowired
    private FalabellaRepository repo;

    @PostMapping("/crear")
    public String crear(@RequestBody @Valid Falabella model) {
        try {
            repo.save(model);
            return "Producto creada";
        } catch (Exception e) {
            throw e;
        }
    }

    @DeleteMapping("/eliminar/{sku}")
    public String eliminarTarea(@RequestBody @Valid Falabella model) {
        try {
            repo.delete(model);
            return "Producto " + model.getSku() + " eliminada";
        } catch (Exception e) {
            throw e;
        }
    }

}
