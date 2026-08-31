package co.edu.demoAcademico.services;

public class EstudianteNoEncontradoException extends RuntimeException {
    public EstudianteNoEncontradoException(String email) {
        super("No se encontró estudiante con el email: " + email);
    }
}
