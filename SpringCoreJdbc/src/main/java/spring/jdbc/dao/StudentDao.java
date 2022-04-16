package spring.jdbc.dao;

import spring.jdbc.entities.Student;

import java.util.List;

public interface StudentDao {

    public int insert(Student student);
    public int change(Student student);
    public int remove(Student student);
    public Student getStudent(int id); //get single student
    public List<Student> getStudents();
}
