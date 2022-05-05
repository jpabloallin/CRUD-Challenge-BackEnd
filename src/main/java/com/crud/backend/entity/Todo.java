package com.crud.backend.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Todo")
@Table(name = "todo")
@Data
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private boolean completed;

    private Long fkCategoryId;

}
