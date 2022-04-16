package org.example.dao;

import org.example.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class StudentDao {

    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    //insert
    public int insert(Student student)
    {
        int res = (int) this.hibernateTemplate.save(student);

        return res;
    }

    //read
    public Student getStudent(int id)
    {
        Student res = hibernateTemplate.get(Student.class,id);

        return res;
    }

    //read all students
    public List<Student> getAllStudents()
    {
        List<Student> res = hibernateTemplate.loadAll(Student.class);
        return res;
    }

    //delete
    @Transactional
    public Student removeStudent(int id)
    {
        Student student = hibernateTemplate.get(Student.class,id);
        hibernateTemplate.delete(student);
        return student;
    }

    //update data
    @Transactional
    public void updateStudent(Student student)
    {
        hibernateTemplate.update(student);
        return;
    }

}
