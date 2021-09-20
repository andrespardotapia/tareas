package com.tareas.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.math.BigDecimal;


@Entity
@Getter
@Setter
@ToString
public class Falabella {

    @Id
    @NotNull
    @Min(value = 1000000)
    @Max(value = 99999999)
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
    @Min(value = 1)
    @Max(value = 99999999)
    private Double price;

    @Column(name = "principalImage")
    @NotBlank(message = "no debe ser vacio")
    private String principalImage;

    @Column(name = "otherImages")
    @NotBlank(message = "no debe ser vacio")
    private String otherImages;

}

