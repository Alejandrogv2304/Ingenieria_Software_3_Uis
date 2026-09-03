package co.edu.demoAcademico.estudiantes.port;

import co.edu.demoAcademico.estudiantes.model.Estudiante;

public interface EstudianteQueryPort {
    Estudiante obtenerPorId(Long id);
}
