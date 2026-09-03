package co.edu.demoAcademico.service;


import co.edu.demoAcademico.model.Asignatura;
import java.util.List;

public interface AsignaturaService {
    Asignatura crear(Asignatura a);
    Asignatura obtenerPorId(Long id);
    List<Asignatura> listar();
    void eliminar(Long id);
}