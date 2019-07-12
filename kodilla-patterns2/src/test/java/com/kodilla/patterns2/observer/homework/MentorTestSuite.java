package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        TaskQueue student1 = new TaskQueue("Student 1");
        TaskQueue student2 = new TaskQueue("Student 2");
        TaskQueue student3 = new TaskQueue("Student 3");
        TaskQueue student4 = new TaskQueue("Student 4");
        TaskQueue student5 = new TaskQueue("Student 5");
        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");
        student1.registerObserver(mentor1);
        student2.registerObserver(mentor1);
        student3.registerObserver(mentor2);
        student4.registerObserver(mentor1);
        student5.registerObserver(mentor2);
        //When
        student1.addTask("20.4");
        student1.addTask("20.5");
        student2.addTask("13.3");
        student3.addTask("21.2");
        student3.addTask("21.3");
        student4.addTask("9.1");
        student4.addTask("9.2");
        student4.addTask("9.3");
        student5.addTask("18.2");
        student1.addTask("21.1");
        //Then
        assertEquals(7, mentor1.getUpdateCount());
        assertEquals(3, mentor2.getUpdateCount());
    }
}
