package com.meucarrokotlin.repository

import com.meucarrokotlin.entity.Modelo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.Query

@Repository
public interface ModeloRepository : JpaRepository<Modelo,Long> {
    @Query(value = "SELECT COUNT(marca_id) FROM  modelo WHERE marca_id=:id", nativeQuery = true)
    fun  contadorDeMarcasNaTabelaModelo(id:Long):Integer

    @Query(value = "SELECT * FROM  modelo WHERE marca_id=:id", nativeQuery = true)
    fun  findAllByMarca(id:Long):List<Modelo>

}