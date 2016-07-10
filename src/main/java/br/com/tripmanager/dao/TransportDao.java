package br.com.tripmanager.dao;

import br.com.tripmanager.domain.Transport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TransportDao extends CrudRepository<Transport, Long> {
}
