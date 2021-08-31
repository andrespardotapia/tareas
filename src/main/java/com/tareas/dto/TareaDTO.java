package com.tareas.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@ToString
public class TareaDTO {
    @NotNull
    private int idTarea;
    @NotBlank()
    private String descripcion;
    @NotNull
    private Date fechaCreacion;
    @NotNull
    private boolean vigencia;
}
