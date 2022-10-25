package com.meucarrokotlin.controller
import com.meucarrokotlin.entity.Marca
import com.meucarrokotlin.service.MarcaService
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*
/*import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;*/
import javax.validation.Valid;
//@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/marca")
class MarcaController (val marcaService: MarcaService){


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun save(@Valid @RequestBody marca: Marca): Marca = marcaService.save(marca)

    @GetMapping("/findAll")
    fun findAll() = marcaService.getAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) = marcaService.getById(id)

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Long) = marcaService.remove(id)


    @GetMapping()
    fun findAll(@PageableDefault(size=10) peageable : Pageable)= marcaService.findAll(peageable)


}