package com.api.taylor.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "users")
@Data
public class TUsers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @Column(name = "firstname", length = 60 )
    protected String firstname;

    @Column(name = "lastname", length = 60 )
    protected  String lastname;

    @Column(name = "email", length = 150 )
    protected  String email;

    @Column(name = "tel", length = 20 )
    protected  String tel;

    @Column(name = "password", length = 10 )
    protected  String password;

    @Column(name = "birthdate")
    protected Date birthdate;

    @Column(name = "isTaylor")
    protected boolean isTaylor;

    @Column(name = "isCustomer")
    protected boolean isCustomer;

    @Column(name = "isAdmin")
    protected boolean isAdmin;

    @Column(name = "sexe", length = 1)
    protected  String sexe;
}
