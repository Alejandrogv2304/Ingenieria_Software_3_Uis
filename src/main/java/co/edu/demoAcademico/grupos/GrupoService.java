package co.edu.demoAcademico.grupos;

import co.edu.demoAcademico.grupos.model.Grupo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface GrupoService {
    Grupo crear(Grupo g);
    Grupo obtenerPorId(Long id);
    Page<Grupo> listar(Pageable pageable);
    void eliminar(Long id);
}
