package me.boogst.market.persitence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    private String id;
    private String nombre;
    private String apellidos;
    private Long celular;
    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;


    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;

}
