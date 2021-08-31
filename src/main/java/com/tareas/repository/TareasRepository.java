package com.tareas.repository;

import com.tareas.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareasRepository extends JpaRepository<Tarea, Integer> {
}
