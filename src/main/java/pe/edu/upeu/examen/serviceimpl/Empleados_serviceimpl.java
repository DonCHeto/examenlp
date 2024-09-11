package pe.edu.upeu.examen.serviceimpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.examen.entity.Empleados;
import pe.edu.upeu.examen.repository.Empleados_repository;
import pe.edu.upeu.examen.service.Empleados_service;
@Service
public class Empleados_serviceimpl implements Empleados_service{
	@Autowired
	private Empleados_repository empleados_repository;
	
	@Override
	public Empleados create(Empleados a) {
		// TODO Auto-generated method stub
		return empleados_repository.save(a);
	}

	@Override
	public Empleados update(Empleados a) {
		// TODO Auto-generated method stub
		return empleados_repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		empleados_repository.deleteById(id);
	}

	@Override
	public Optional<Empleados> read(Long id) {
		// TODO Auto-generated method stub
		return empleados_repository.findById(id);
	}

	@Override
	public List<Empleados> readAll() {
		// TODO Auto-generated method stub
		return empleados_repository.findAll();
	}
}