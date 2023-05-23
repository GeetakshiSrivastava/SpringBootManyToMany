package com.app.SpringBootManyToMany.runner;

import com.app.SpringBootManyToMany.entity.Book;
import com.app.SpringBootManyToMany.entity.Student;
import com.app.SpringBootManyToMany.repo.BookRepository;
import com.app.SpringBootManyToMany.repo.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class TestRunner implements CommandLineRunner {


    @Autowired
    private StudentRepository srepo;

    @Autowired
    private BookRepository brepo;

    @Override
    public void run(String... args) throws Exception {
        //create Book Objs
        Book bk1 = new Book(50,"DS");
        Book bk2 = new Book(60,"SB");
        Book bk3 = new Book(70,"HB");

        //save book
        brepo.save(bk1);
        brepo.save(bk2);
        brepo.save(bk3);

        Set<Book> s1 = Set.of(bk1,bk3);
        Set<Book> s2 = Set.of(bk2,bk3);


        //stu obj
        Student st1 = new Student(101,"SAM",s1);
        Student st2 = new Student(102,"JHON",s2);

        //save stu
        srepo.save(st1);
        srepo.save(st2);
    }
}
