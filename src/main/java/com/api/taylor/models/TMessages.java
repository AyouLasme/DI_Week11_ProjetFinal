package com.api.taylor.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.io.Serializable;

@Entity
@Table(name = "messages")
@Data
public class TMessages implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @Column(name="dateMsg")
    private String dateMsg;

    @Column(name = "sender")
    private SecurityProperties.User sender;

    @Column(name = "receiver")
    private SecurityProperties.User receiver;
}
