package com.tareas.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;


@Entity
@Getter
@Setter
@ToString
public class Falabella {

    @Id
    @NotNull
    private int sku;

    @NotBlank(message = "no debe ser vacio")
    @Size(min=3, max=50)
    @Column(name = "name")
    private String name;

    @NotBlank(message = "no debe ser vacio")
    @Size(min=3, max=50)
    @Column(name = "brand")
    private String brand;

    @NotBlank(message = "no debe ser vacio")
    @Column(name = "size")
    private String size;

    @Column(name = "price")
    private Double price;

    @Column(name = "principalImage")
    private String principalImage;

    @Column(name = "otherImages")
    private String otherImages;

}

