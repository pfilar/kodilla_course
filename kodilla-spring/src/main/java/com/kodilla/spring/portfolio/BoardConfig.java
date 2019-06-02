package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDo")
    private TaskList toDoList;

    @Autowired
    @Qualifier("inProgres")
    private TaskList inProgress;

    @Autowired
    @Qualifier("done")
    private TaskList done;

    @Bean
    public Board board() {
        return new Board(toDoList, inProgress, done);
    }

    @Bean(name = "toDo")
    @Scope("prototype")
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgres")
    @Scope("prototype")
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Bean(name = "done")
    @Scope("prototype")
    public TaskList doneList() {
        return new TaskList();
    }
}
