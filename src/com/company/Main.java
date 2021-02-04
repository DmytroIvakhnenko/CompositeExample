package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Container container = new Container(List.of(
                new Monitor(),
                new Laptop(),
                new Container(List.of(
                        new Monitor(),
                        new Laptop())
                )));

        System.out.println(container.getWeight());
    }
}
