package co.edu.demoAcademico.service;

import co.edu.demoAcademico.common.exception.NotFoundException;
import co.edu.demoAcademico.grupos.model.Grupo;
import co.edu.demoAcademico.grupos.GrupoRepository;
import co.edu.demoAcademico.grupos.GrupoService;
import co.edu.demoAcademico.grupos.port.GrupoQueryPort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GrupoServiceImpl implements GrupoService, GrupoQueryPort {

    private final GrupoRepository repo;

    public GrupoServiceImpl(GrupoRepository repo) {
        this.repo = repo;
    }

    @Override
    @Transactional(readOnly = true)
    public Grupo obtenerPorId(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new NotFoundException("Grupo no encontrado: " + id));
    }

    @Override
    public Grupo crear(Grupo g) {
        return repo.save(g);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Grupo> listar(Pageable pageable) {
        return repo.findAll(pageable);
    }

    @Override
    public void eliminar(Long id) {
        repo.delete(obtenerPorId(id));
    }
}
