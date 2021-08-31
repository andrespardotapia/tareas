package com.tareas.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import java.util.Date;

@Getter
@Setter
@ToString
public class TareaDTO {
    private int idTarea;

    private String descripcion;

    private Date fechaCreacion;

    private boolean vigencia;
}
