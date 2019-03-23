package me.lutao.bean;

import me.lutao.inter.Animal;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("cat eat");
    }
    @Override
    public void la() {
        System.out.println("cat la");
    }
}
