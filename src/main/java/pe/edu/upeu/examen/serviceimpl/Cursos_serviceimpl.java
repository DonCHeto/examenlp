package pe.edu.upeu.examen.serviceimpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.examen.entity.Cursos;
import pe.edu.upeu.examen.repository.Cursos_repository;
import pe.edu.upeu.examen.service.Cursos_service;
@Service
public class Cursos_serviceimpl implements Cursos_service{
	@Autowired
	private Cursos_repository cursos_repository;
	
	@Override
	public Cursos create(Cursos a) {
		// TODO Auto-generated method stub
		return cursos_repository.save(a);
	}

	@Override
	public Cursos update(Cursos a) {
		// TODO Auto-generated method stub
		return cursos_repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cursos_repository.deleteById(id);
	}

	@Override
	public Optional<Cursos> read(Long id) {
		// TODO Auto-generated method stub
		return cursos_repository.findById(id);
	}

	@Override
	public List<Cursos> readAll() {
		// TODO Auto-generated method stub
		return cursos_repository.findAll();
	}
}