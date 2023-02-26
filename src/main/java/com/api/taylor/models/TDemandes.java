package com.api.taylor.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.sql.Date;

@Entity
@Table(name = "demandes")
@Data
public class TDemandes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @Column(name = "dateDmd")
    private String dateDmd;

    @Column(name = "object")
    private String object;

    @Column(name = "content")
    private String content;

    @Column(name = "sender")
    private SecurityProperties.User sender;

    @Column(name = "receiver")
    private SecurityProperties.User receiver;
}
