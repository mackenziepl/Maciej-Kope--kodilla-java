package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTaskTestSuite {
    @Test
    public void testUpdate() {
        //Given
        StudentTask johnSmith = new StudentTask("John Smith");
        StudentTask jamesBond = new StudentTask("James Bond");
        StudentTask ivoneEscobar = new StudentTask("Ivone Escobar");
        Mentor mentor1 = new Mentor("Mentor One");
        Mentor mentor2 = new Mentor("Mentor Two");
        johnSmith.registerObserver(mentor1);
        jamesBond.registerObserver(mentor2);
        ivoneEscobar.registerObserver(mentor1);

        //When
        johnSmith.addTask("Task 1");
        jamesBond.addTask("Task 2");
        ivoneEscobar.addTask("Task 3");
        jamesBond.addTask("Task 4");
        johnSmith.addTask("Task 5");

        //Than
        assertEquals(2, jamesBond.getTasks().size());
        assertEquals(3, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
    }
}
