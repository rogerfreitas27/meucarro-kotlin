package com.meucarrokotlin.repository

import com.meucarrokotlin.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MarcaRepository : JpaRepository<Marca,Long> {



}