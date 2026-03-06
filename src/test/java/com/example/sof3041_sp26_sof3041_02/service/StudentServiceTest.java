package com.example.sof3041_sp26_sof3041_02.service;

import com.example.sof3041_sp26_sof3041_02.entity.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private StudentService studentService;

    @BeforeEach
    void setUp() {
        studentService = new StudentService();
    }

    //add
    //1. valid stuident
    @Test
    void addSttudentWithValidStudent(){

        Student student = new Student(1L, 20, "John Doe", 8.5);
        studentService.addStudent(student);

        assertEquals(1L, studentService.getAllStudents().size());
        assertEquals(20, studentService.getStudentByID(1L).getAge());

    }

    //null
    @Test
    void addStudentWithNull(){

      Exception exception =  assertThrows(IllegalArgumentException.class, () -> studentService.addStudent(null));

      assertEquals("Student cannot be null", exception.getMessage());

    }



    //invalid age
@Test
void addStudentWithInvalidAge(){
   Exception exception = assertThrows(IllegalArgumentException.class, () ->
                studentService.addStudent(new Student(1L, 10,"phong", 9.0)));
        assertEquals("Age must be at least 18", exception.getMessage());

}

    //invalid mark
  @Test
    void addStudentWithInvalidMark() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                studentService.addStudent(new Student(1L, 20,"phong", 11.0)));
        assertEquals("Mark must be between 0 and 10", exception.getMessage());
  }



  // update
    // 1. Valid Student
    @Test
    void updateStudentWithValidStudent() {
        Student student = new Student(1L, 20, "John Doe", 8.5);
        studentService.addStudent(student);

        student.setName("Jane Doe");
        student.setAge(22);
        student.setMark(9.0);

        studentService.updaeStudent(student);

        assertEquals("Jane Doe", studentService.getStudentByID(1L).getName());
        assertEquals(22, studentService.getStudentByID(1L).getAge());
        assertEquals(9.0, studentService.getStudentByID(1L).getMark());



    }

     // 2. null
    @Test
    void updateStudentWithNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> studentService.updaeStudent(null));
        assertEquals("Student cannot be null", exception.getMessage());
    }



      // 3. invalid age
    @Test
    void updateStudentWithInvalidAge() {
        Student student = new Student(1L, 20, "John Doe", 8.5);
        studentService.addStudent(student);

        student.setAge(10);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> studentService.updaeStudent(student));
        assertEquals("Age must be at least 18", exception.getMessage());
    }

     // 4. invalid mark
    @Test
    void updateStudentWithInvalidMark() {
        Student student = new Student(1L, 20, "John Doe", 8.5);
        studentService.addStudent(student);
    }




}