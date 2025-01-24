package com.aws.api.app.reto.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/api/v1")
@RestController
@Validated
@RequiredArgsConstructor
@CrossOrigin(origins = "*", methods = { RequestMethod.GET })
@Tag(name = "Personas", description = "Servicio dedicado al manejo de personas")
public class PersonController {

    @GetMapping(value = "/person/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Obtener el detalle de una persona", description = "Retorna una persona segun su id (mandatorio)")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Persona retornada correctamente", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "400", description = "Solicitud realizada de manera incorrecta", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", description = "Persona no encontrada", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", description = "Error inesperado durante el proceso", content = { @Content(schema = @Schema()) }) })
    public String getPersonById(@PathVariable("id") String id) {
        return "Hello, world!";
    }

    @PostMapping(value = "/person", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Guardas los datos de una persona", description = "Retorna una persona que se guardo recientemente")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Persona guardada correctamente", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "400", description = "Los datos recibidos no cumplen con la obligatoriedad o formatos esperados", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", description = "Error inesperado durante el proceso", content = { @Content(schema = @Schema()) }) })
    public String savePerson(@RequestBody Object person) {
        return "Hellow, world!";
    }
}
