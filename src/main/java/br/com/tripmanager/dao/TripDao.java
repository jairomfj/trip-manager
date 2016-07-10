package br.com.tripmanager.dao;

import br.com.tripmanager.domain.Trip;
import br.com.tripmanager.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TripDao extends CrudRepository<Trip, Long> {
    public Trip findByDestiny(String destiny);
}
