package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getDoneList().addTask("TASK1");
        board.getInProgressList().addTask("TASK2");
        board.getToDoList().addTask("TASK3");

        //Then
        Assert.assertEquals("TASK1", board.getDoneList().getTasks().get(0));
        Assert.assertEquals("TASK2", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("TASK3", board.getToDoList().getTasks().get(0));

        //Readable
        System.out.println(board.getDoneList().getTasks().get(0));
        System.out.println(board.getInProgressList().getTasks().get(0));
        System.out.println(board.getToDoList().getTasks().get(0));
    }
}
