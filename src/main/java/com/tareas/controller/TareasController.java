package com.tareas.controller;

import com.tareas.dto.TareaDTO;
import com.tareas.model.Tarea;
import com.tareas.repository.TareasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TareasController {

    public TareasController(TareasRepository repo) {
        this.repo = repo;
    }

    @Autowired
    private TareasRepository repo;

    @PostMapping("/crear")
    public String crear(@RequestBody @Valid TareaDTO request) {
        Tarea t = new Tarea();
        t.setIdTarea(request.getIdTarea());
        t.setDescripcion(request.getDescripcion());
        t.setFechaCreacion(request.getFechaCreacion());
        t.setVigencia(request.isVigencia());
        repo.save(t);

        return "Tarea creada";
    }

    @PostMapping("/listar")
    public List<Tarea> listarTareas() {
        return repo.findAll();
    }

    @PostMapping("/eliminar")
    public String eliminarTarea(@RequestBody TareaDTO request) {
        Tarea t = new Tarea();
        t.setIdTarea(request.getIdTarea());
        t.setDescripcion(request.getDescripcion());
        t.setFechaCreacion(request.getFechaCreacion());
        t.setVigencia(request.isVigencia());
        repo.delete(t);
        return "Tarea " + request.getIdTarea() + " eliminada";
    }

    @PutMapping("/editar")
    public String editarTarea(@RequestBody TareaDTO request) {
        Tarea t = new Tarea();
        t.setIdTarea(request.getIdTarea());
        t.setDescripcion(request.getDescripcion());
        t.setFechaCreacion(request.getFechaCreacion());
        t.setVigencia(request.isVigencia());
        repo.save(t);
        return "Tarea editada";

    }
}
