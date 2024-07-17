package Bawlant.StudentSystem.service;

import Bawlant.StudentSystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
