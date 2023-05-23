package com.app.SpringBootManyToMany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "stdtab")
public class Student {
    @Id
    private Integer sid;

    private String sname;

    @ManyToMany
    @JoinTable(name = "stbktab",
            joinColumns = @JoinColumn(name="sidFk"),
            inverseJoinColumns = @JoinColumn(name="bidFk")
    )
    private Set<Book> bobs;

}
