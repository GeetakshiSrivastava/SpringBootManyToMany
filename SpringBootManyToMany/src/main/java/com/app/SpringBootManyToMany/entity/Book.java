package com.app.SpringBootManyToMany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bktab")
public class Book {
    @Id
    private Integer bid;

    private String bname;

}
