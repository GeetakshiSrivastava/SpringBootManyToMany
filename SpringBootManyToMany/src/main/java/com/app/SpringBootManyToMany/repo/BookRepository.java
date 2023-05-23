package com.app.SpringBootManyToMany.repo;

import com.app.SpringBootManyToMany.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
