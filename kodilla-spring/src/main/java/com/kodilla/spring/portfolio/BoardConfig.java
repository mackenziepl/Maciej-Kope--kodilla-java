package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("listOne")
    TaskList listOne;
    @Qualifier("listTwo")
    TaskList listTwo;
    @Qualifier("listThree")
    TaskList listThree;

    @Bean
    public Board getBoard() {
        return new Board(listOne, listTwo, listThree);
    }

    @Bean(name = "listOne")
    @Scope("prototype")
    public TaskList getListOne() {
        ArrayList<String> one = new ArrayList<>();
                one.add("one");
             return new TaskList(one);
    }

    @Bean(name = "listTwo")
    @Scope("prototype")
    public TaskList getListTwo() {
        ArrayList<String> two = new ArrayList<>();
        two.add("two");
        return new TaskList(two);
    }

    @Bean(name = "listThree")
    @Scope("prototype")
    public TaskList getListThree() {
        ArrayList<String> three = new ArrayList<>();
        three.add("three");
        return new TaskList(three);
    }
}
