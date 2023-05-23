package com.app.SpringBootManyToMany.repo;

import com.app.SpringBootManyToMany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
