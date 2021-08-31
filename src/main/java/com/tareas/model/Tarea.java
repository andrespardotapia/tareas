package com.tareas.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
public class Tarea {

    @Id
    private int idTarea;

    @Column(name = "descripcion", length = 50)
    private String descripcion;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "vigencia")
    private boolean vigencia;
}
