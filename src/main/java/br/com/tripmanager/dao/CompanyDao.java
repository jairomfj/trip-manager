package br.com.tripmanager.dao;

import br.com.tripmanager.domain.Company;
import br.com.tripmanager.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CompanyDao extends CrudRepository<Company, Long> {
    public Company findByName(String name);
}
