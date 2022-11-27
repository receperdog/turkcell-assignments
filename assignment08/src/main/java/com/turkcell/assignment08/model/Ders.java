package com.turkcell.assignment08.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
//For specificy this is table
@Entity
public class Ders
{
    @Id
    private long ID;
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    //Bir öğretmen birden fazla ders verebilir
    private Ogretmen ogretmen;
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    //Bir konu birden fazla ders
    private Konu konu;

}
