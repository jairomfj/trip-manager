package br.com.tripmanager.dao;

import br.com.tripmanager.domain.Costumer;
import br.com.tripmanager.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CostumerDao extends CrudRepository<Costumer, Long> {
    public Costumer findByName(String name);
}
