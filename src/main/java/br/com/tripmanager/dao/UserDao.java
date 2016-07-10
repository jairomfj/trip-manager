package br.com.tripmanager.dao;

import br.com.tripmanager.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {
    public User findByUsername(String username);
}
