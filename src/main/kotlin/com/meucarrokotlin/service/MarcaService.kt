package com.meucarrokotlin.service
import com.meucarrokotlin.entity.Marca
import com.meucarrokotlin.repository.MarcaRepository
import com.meucarrokotlin.repository.ModeloRepository
import javax.transaction.Transactional
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



@Service
class MarcaService (val repository: MarcaRepository,val modeloRepository : ModeloRepository)  {
    @Transactional
    fun save(marca: Marca): Marca = repository.save(marca)


    @Transactional
    fun update(id: Long, marca: Marca): Marca {
        return if (repository.existsById(id)) {
            marca.id = id
            repository.save(marca)
        } else throw ResponseStatusException(HttpStatus.NOT_FOUND)
    }



    fun getById(id: Long): Marca = repository.findByIdOrNull(id) ?:
    throw ResponseStatusException(HttpStatus.NOT_FOUND)




    @Transactional
    fun remove(id: Long) {
        if (modeloRepository.contadorDeMarcasNaTabelaModelo(id) >0 ) {
            throw ResponseStatusException(HttpStatus.BAD_REQUEST)
        }else repository.deleteById(id)
    }

    fun getAll(): List<Marca> = repository.findAll()

   fun findAll(peageble :Pageable ):Page<Marca> = repository.findAll(peageble)

}


