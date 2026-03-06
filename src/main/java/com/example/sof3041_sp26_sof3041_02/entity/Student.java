package com.example.sof3041_sp26_sof3041_02.entity;

public class Student {
    private Long id;
    private String name;
    private int age;
    private double mark;

    public Student() {
    }

    public Student(Long id, int age, String name, double mark) {
        this.id = id;
//        this.age = age;
//        this.name = name;
//        this.mark = mark;

        setName(name);
        setAge(age);
        setMark(mark);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark < 0 || mark > 10) {
            throw new IllegalArgumentException("Mark must be between 0 and 10");
        }

        this.mark = mark;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 ) {
            throw new IllegalArgumentException("Age must be at least 18");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }
}
