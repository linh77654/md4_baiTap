package com.example.spring_mvc.repository;

import com.example.spring_mvc.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {

    private static List<Student> students = new ArrayList<>();

    @Override
    static{
        students.add(new Student(1, "Linh"));
        students.add(new Student(2, "Hoàng"));
        students.add(new Student(3, "Nguyễn"));
    }
    public List<Student> findAll() {
        return students;
    }
}
