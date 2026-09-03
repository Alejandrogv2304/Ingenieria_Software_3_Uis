package co.edu.demoAcademico.asignaturas;


import java.util.List;

public interface AsignaturaService {
    Asignatura crear(Asignatura a);
    Asignatura obtenerPorId(Long id);
    List<Asignatura> listar();
    void eliminar(Long id);
}