package es.joseluisgs.kotlinspringbootrestservice.errors.productos

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

// Nos permite devolver un estado cuando salta la excepción
@ResponseStatus(HttpStatus.BAD_REQUEST)
class ProductoBadRequestException(campo: String, error: String) :
    RuntimeException("Existe un error en el campo: $campo Error: $error")