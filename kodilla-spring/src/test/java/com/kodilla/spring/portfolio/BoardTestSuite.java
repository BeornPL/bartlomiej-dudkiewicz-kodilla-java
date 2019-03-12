package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getDoneList().getTasks().add("done Task");
        board.getInProgressList().getTasks().add("inProgress Task");
        board.getToDoList().getTasks().add("toDo Task");
        //Then
        System.out.println(board.getDoneList().getTasks());
        System.out.println(board.getInProgressList().getTasks());
        System.out.println(board.getToDoList().getTasks());
    }

    @Test
    public void test() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When & Then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }
}
