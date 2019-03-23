package me.lutao.bean;

public class Student {

    private String ID;
    private String name;
    private int age;
    private String FM;

    public Student() {

    }

    public Student(String ID, String name, int age, String FM) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.FM = FM;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFM() {
        return FM;
    }

    public void setFM(String FM) {
        this.FM = FM;
    }

    public void display(){
        System.out.println(ID + " " + name + " " + age + " " + FM);
    }
}
