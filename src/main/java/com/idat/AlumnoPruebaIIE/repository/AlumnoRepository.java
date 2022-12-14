package com.idat.AlumnoPruebaIIE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.AlumnoPruebaIIE.model.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {

}
