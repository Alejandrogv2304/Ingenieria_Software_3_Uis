package co.edu.demoAcademico.controller;

import co.edu.demoAcademico.api.ApiResponse;
import co.edu.demoAcademico.api.ResponseBuilder;
import co.edu.demoAcademico.dto.MatriculaCreateDTO;
import co.edu.demoAcademico.dto.MatriculaDTO;
import co.edu.demoAcademico.handler.MatriculaHandler;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/matriculas")
public class MatriculaController {

    private final MatriculaHandler handler;

    public MatriculaController(MatriculaHandler handler) {
        this.handler = handler;
    }

    @PostMapping
    public ResponseEntity<ApiResponse<MatriculaDTO>> matricular(@Valid @RequestBody MatriculaCreateDTO in) {
        return ResponseBuilder.created("Matrícula registrada", handler.matricular(in));
    }
}