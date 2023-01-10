package com.estiam.lu.locaCar.domaine;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idVehicule;

    @Column
    private String immatriculation;

    @Column
    private String marque;

    @Column
    private String color;
}