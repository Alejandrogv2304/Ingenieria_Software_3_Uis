package co.edu.demoAcademico.services;

import co.edu.demoAcademico.exception.EmailAlreadyExists;
import co.edu.demoAcademico.models.Estudiante;
import co.edu.demoAcademico.repositories.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {

    private final EstudianteRepository repository;

    public EstudianteService(EstudianteRepository repository) {
        this.repository = repository;
    }

    public Estudiante crear(Estudiante estudiante) {

        // ----------------------------
        // ZONA DE LÓGICA DE NEGOCIO:
        // Regla: email único
        // ----------------------------
        repository.findByEmail(estudiante.getEmail())
                .ifPresent(e -> {
                    throw new IllegalStateException("Email ya registrado");
                });

        // ============================
        // ZONA DE ACCESO A LA BD:
        // Persistencia vía Repository
        // ============================
        return repository.save(estudiante);
    }

    public List<Estudiante> listar() {
        // ============================
        // ZONA DE ACCESO A LA BD:
        // Consulta vía Repository
        // ============================
        return repository.findAll();
    }

    public Optional<Estudiante> buscarPorEmail(String email){
         Optional<Estudiante> estudiante=repository.findByEmail(email);
        if(!estudiante.isEmpty()){
            throw new EmailAlreadyExists("Email ya registrado");
        }
         return estudiante;
    }
}