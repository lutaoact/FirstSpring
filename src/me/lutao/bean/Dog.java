package me.lutao.bean;

import me.lutao.inter.Animal;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("dog eat");
    }
    @Override
    public void la() {
        System.out.println("dog la");
    }
}
