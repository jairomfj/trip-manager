package br.com.tripmanager.dao;

import br.com.tripmanager.domain.Inn;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface InnDao extends CrudRepository<Inn, Long> {
}
