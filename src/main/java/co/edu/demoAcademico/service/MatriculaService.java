package co.edu.demoAcademico.service;

import co.edu.demoAcademico.model.Matricula;

public interface MatriculaService {
    Matricula matricular(Long estudianteId, Long grupoId);
}
