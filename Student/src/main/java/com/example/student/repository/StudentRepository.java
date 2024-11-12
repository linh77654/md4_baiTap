package com.example.student.repository;


import com.example.student.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository implements IStudentRepository {
    private static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1,"linh"));
        studentList.add(new Student(2,"hoàng"));
        studentList.add(new Student(3,"nguyễn"));
    }
   @Override
   public List<Student> findAll(){
        return studentList;
   }
}
