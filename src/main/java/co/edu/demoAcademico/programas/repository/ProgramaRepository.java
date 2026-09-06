package co.edu.demoAcademico.programas.repository;

import co.edu.demoAcademico.programas.model.Programa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramaRepository extends JpaRepository<Programa, Long> {
    boolean existsByCodigo(String codigo);
}
