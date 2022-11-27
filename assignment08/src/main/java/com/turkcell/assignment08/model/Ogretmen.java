package com.turkcell.assignment08.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Ogretmen
{
    // bigint
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long ID;
    @Column(name = "ad" , length = 100)
    private String name;
    private boolean isGicik;
}
