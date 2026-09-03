package co.edu.demoAcademico.matriculas.service;

import co.edu.demoAcademico.matriculas.model.Matricula;

public interface MatriculaService {
    Matricula matricular(Long estudianteId, Long grupoId);
}
