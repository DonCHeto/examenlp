package pe.edu.upeu.examen.serviceimpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.examen.entity.Alumnos;
import pe.edu.upeu.examen.repository.Alumnos_repository;
import pe.edu.upeu.examen.service.Alumnos_service;
@Service
public class Alumnos_serviceimpl implements Alumnos_service{
	@Autowired
	private Alumnos_repository alumnos_repository;
	
	@Override
	public Alumnos create(Alumnos a) {
		// TODO Auto-generated method stub
		return alumnos_repository.save(a);
	}

	@Override
	public Alumnos update(Alumnos a) {
		// TODO Auto-generated method stub
		return alumnos_repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		alumnos_repository.deleteById(id);
	}

	@Override
	public Optional<Alumnos> read(Long id) {
		// TODO Auto-generated method stub
		return alumnos_repository.findById(id);
	}

	@Override
	public List<Alumnos> readAll() {
		// TODO Auto-generated method stub
		return alumnos_repository.findAll();
	}
}