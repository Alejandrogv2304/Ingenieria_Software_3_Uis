package co.edu.demoAcademico.grupos.port;

import co.edu.demoAcademico.grupos.model.Grupo;

public interface GrupoQueryPort {
    Grupo obtenerPorId(Long id);
}
