package pe.edu.upeu.examen.service;
import java.util.List;
import java.util.Optional;

import pe.edu.upeu.examen.entity.Alumnos;

public interface Alumnos_service {
	Alumnos create(Alumnos c);
	Alumnos update(Alumnos c);
	void delete(Long id);
	Optional<Alumnos> read(Long id);
	List<Alumnos> readAll();
}
