package com.meucarrokotlin.repository


import org.springframework.data.repository.query.Param

import Carro
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.Query

@Repository
 public interface CarroRepository : JpaRepository<Carro,Long> {

 @Query(value = "SELECT COUNT(modelo_id) from  carro where modelo_id=:id", nativeQuery = true)
 fun  contadorModeloNaTabelaCarro(id: Long):Integer





 @Query("SELECT c FROM Carro c JOIN c.modelo_id m WHERE lower(m.nome) LIKE  %:searchTerm%")
 fun search( @Param("searchTerm")  searchTerm: String,
 pageable: Pageable): Page<Carro>


}