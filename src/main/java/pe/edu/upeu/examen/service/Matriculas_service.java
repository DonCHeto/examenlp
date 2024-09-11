package pe.edu.upeu.examen.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.examen.entity.Matriculas;


public interface Matriculas_service {
	Matriculas create(Matriculas c);
	Matriculas update(Matriculas c);
	void delete(Long id);
	Optional<Matriculas> read(Long id);
	List<Matriculas> readAll();
}