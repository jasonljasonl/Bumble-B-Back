package com.BumblebeeDatabase.BumblebeeDatabase.model;

import jakarta.persistence.*;
import lombok.Data;

// Création de la table
@Entity
@Data
@Table(name = "USERS")
public class Users {

    @Id
    // Incrémente automatiquement l'ID a chaque utilisateur crée
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID")
        private int id;

    @Column(name= "NAME")
        private String name;

    @Column(name= "PASSWORD")
        private String password;

    @Column(name= "EMAIL")
        private String email;

    public Users() {
    }
}
