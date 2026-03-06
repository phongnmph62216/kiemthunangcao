package com.example.sof3041_sp26_sof3041_02.service;

import com.example.sof3041_sp26_sof3041_02.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();


    //methods: CRUD
    public void addStudent(Student student) {

        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null");

        }
        students.add(student);
    }

    public Student getStudentByID(Long id) {

        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;


    }

    public void updaeStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null");
        }
        for (int i = 0; i < students.size(); ++i) {
            if (students.get(i).getId() == student.getId()) {
                students.set(i, student);
                return;
            } else {
                throw new IllegalArgumentException("Student with id " + student.getId() + " not found");
            }
        }
    }

    public boolean deleteStudent(Long id) {

        for (int i = 0; i < students.size(); ++i) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }


    public List<Student> getAllStudents() {

        return students;


    }


}