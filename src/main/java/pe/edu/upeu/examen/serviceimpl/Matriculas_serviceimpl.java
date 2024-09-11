package pe.edu.upeu.examen.serviceimpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.examen.entity.Matriculas;
import pe.edu.upeu.examen.repository.Matriculas_repository;
import pe.edu.upeu.examen.service.Matriculas_service;
@Service
public class Matriculas_serviceimpl implements Matriculas_service{
	@Autowired
	private Matriculas_repository matriculas_repository;
	
	@Override
	public Matriculas create(Matriculas a) {
		// TODO Auto-generated method stub
		return matriculas_repository.save(a);
	}

	@Override
	public Matriculas update(Matriculas a) {
		// TODO Auto-generated method stub
		return matriculas_repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		matriculas_repository.deleteById(id);
	}

	@Override
	public Optional<Matriculas> read(Long id) {
		// TODO Auto-generated method stub
		return matriculas_repository.findById(id);
	}

	@Override
	public List<Matriculas> readAll() {
		// TODO Auto-generated method stub
		return matriculas_repository.findAll();
	}
}