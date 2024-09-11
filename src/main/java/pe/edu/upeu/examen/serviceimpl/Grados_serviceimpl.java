package pe.edu.upeu.examen.serviceimpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.examen.entity.Grados;
import pe.edu.upeu.examen.repository.Grados_repository;
import pe.edu.upeu.examen.service.Grados_service;
@Service
public class Grados_serviceimpl implements Grados_service{
	@Autowired
	private Grados_repository grados_repository;
	
	@Override
	public Grados create(Grados a) {
		// TODO Auto-generated method stub
		return grados_repository.save(a);
	}

	@Override
	public Grados update(Grados a) {
		// TODO Auto-generated method stub
		return grados_repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		grados_repository.deleteById(id);
	}

	@Override
	public Optional<Grados> read(Long id) {
		// TODO Auto-generated method stub
		return grados_repository.findById(id);
	}

	@Override
	public List<Grados> readAll() {
		// TODO Auto-generated method stub
		return grados_repository.findAll();
	}
}