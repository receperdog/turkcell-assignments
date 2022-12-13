package com.turkcell.assignment08.repositories;

import com.turkcell.assignment08.model.Ogretmen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OgretmenRepository extends JpaRepository<Ogretmen, Long> {

}

