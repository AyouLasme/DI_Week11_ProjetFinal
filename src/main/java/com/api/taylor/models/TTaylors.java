package com.api.taylor.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "taylors")
@Data
@AllArgsConstructor
public class TTaylors extends TUsers {
    @Column(name = "category", length = 60)
    private String category;

    @Column(name = "galery", length = 60)
    private String galery;
}
