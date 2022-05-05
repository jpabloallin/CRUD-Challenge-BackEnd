package com.crud.backend.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<Todo> todos = new ArrayList<>();

    public Category addTodo(Todo todo) {
        this.todos.add(todo);

        return this;
    }
}
