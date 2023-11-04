package com.Novitskiy.demo.domain.repo;

import com.Novitskiy.demo.domain.entity.Lastname;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LastnameRepo extends JpaRepository<Lastname, Long> {
    Lastname findByName (String family);
}
