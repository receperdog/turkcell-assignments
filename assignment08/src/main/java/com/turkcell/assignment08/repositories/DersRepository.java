package com.turkcell.assignment08.repositories;

import com.turkcell.assignment08.model.Ders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DersRepository extends JpaRepository<Ders, Long> {


}
