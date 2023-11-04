package com.Novitskiy.demo.domain.repo;

import com.Novitskiy.demo.domain.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
    User findByUsername(String username);

    User findByActivationCode(String code);
}
