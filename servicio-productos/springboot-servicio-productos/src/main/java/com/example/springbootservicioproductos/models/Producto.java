package com.example.springbootservicioproductos.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "productos")
public class Producto implements Serializable {

    private static final long serialVersionUID = 12342312123123L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Double precio;

    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

}
