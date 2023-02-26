package com.api.taylor.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "customers")
@Data
public class TCustomers extends TUsers {
    private String casse;
}
