package pe.edu.upeu.examen.service;
import java.util.List;
import java.util.Optional;

import pe.edu.upeu.examen.entity.Cursos;


public interface Cursos_service {
	Cursos create(Cursos c);
	Cursos update(Cursos c);
	void delete(Long id);
	Optional<Cursos> read(Long id);
	List<Cursos> readAll();
}