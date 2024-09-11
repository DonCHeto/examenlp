package pe.edu.upeu.examen.service;
import java.util.List;
import java.util.Optional;

import pe.edu.upeu.examen.entity.Empleados;


public interface Empleados_service {
	Empleados create(Empleados c);
	Empleados update(Empleados c);
	void delete(Long id);
	Optional<Empleados> read(Long id);
	List<Empleados> readAll();
}
