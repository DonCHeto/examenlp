package pe.edu.upeu.examen.service;
import java.util.List;
import java.util.Optional;

import pe.edu.upeu.examen.entity.Grados;


public interface Grados_service {
	Grados create(Grados c);
	Grados update(Grados c);
	void delete(Long id);
	Optional<Grados> read(Long id);
	List<Grados> readAll();
}
