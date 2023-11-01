package com.Novitskiy.demo.domain.repo;

import com.Novitskiy.demo.domain.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepo extends CrudRepository<Student, Long> {

    List<Student> findByGroupp(int groupp);

}
