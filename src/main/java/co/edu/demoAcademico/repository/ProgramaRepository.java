package co.edu.demoAcademico.repository;

import co.edu.demoAcademico.model.Programa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramaRepository extends JpaRepository<Programa, Long> {
    boolean existsByCodigo(String codigo);
}
