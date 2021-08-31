package com.tareas.controller;

import com.tareas.dto.TareaDTO;
import com.tareas.model.Tarea;
import com.tareas.repository.TareasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TareasController {

    public TareasController(TareasRepository repo) {
        this.repo = repo;
    }

    @Autowired
    private TareasRepository repo;

    @PostMapping(name = "/crear", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String crear(@RequestBody TareaDTO request) {

        Tarea t = new Tarea();
        t.setIdTarea(request.getIdTarea());
        t.setDescripcion(request.getDescripcion());
        t.setFechaCreacion(request.getFechaCreacion());
        t.setVigencia(request.isVigencia());
        repo.save(t);

        return "Tarea creada";
    }

    @PostMapping("/listar")
    @ResponseBody
    public List<Tarea> listarTareas() {
        return repo.findAll();
    }

    @PostMapping("/eliminar")
    @ResponseBody
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
    @ResponseBody
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
