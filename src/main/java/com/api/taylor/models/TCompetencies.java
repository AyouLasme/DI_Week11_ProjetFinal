package com.api.taylor.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "competencies")
@Data
public class TCompetencies implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @Column(name ="title", length = 60)
    private String title;

    @Column(name ="description", length = 2000)
    private String description;


}
