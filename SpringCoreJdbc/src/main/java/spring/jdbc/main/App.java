package spring.jdbc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import spring.jdbc.dao.StudentDao;
import spring.jdbc.entities.Student;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        System.out.println( "My Program Started......" );

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        /*JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class );*/

        //insert

           /*String query = "insert into " +
                "student (id,name,city)" +
                "values (23,'Lala','Greater Noida')";*/

        /*String query = "insert into " +
                "student (id,name,city)" +
                "values (?,?,?)";*/

        //fire query
        /*int count = template.update(query,13,"Aakash","Greater Noida");
        System.out.println("records inserted " + count);*/

        //design pattern :

        StudentDao studentDao = context.getBean("studDaoImpl", StudentDao.class);

        /*Student s1 = new Student();
        s1.setId(33);
        s1.setName("Kshitij Agrawal");
        s1.setCity("Greater Noida");

        int res = studentDao.insert(s1);
        System.out.println("Number of inserted rows are: " + res);*/

        /*Student s2 = new Student();
        s2.setId(33);
        s2.setName("Kshitij Aggrawal");
        s2.setCity("Greater Nooida");

        int res = studentDao.change(s2);
        System.out.println("Number of chnaged rows are: " + res);*/

        /*Student s3 = new Student();
        s3.setId(33);
        *//*s3.setName("Kshitij Aggrawal");
        s3.setCity("Greater Nooida");*//*

        int res = studentDao.remove(s3);
        System.out.println("Number of deleted rows are: " + res);*/

        //get single student with id 13 aakash
        Student s4 = studentDao.getStudent(58);
        System.out.println(s4);

        //get multiple student

        List<Student> students = studentDao.getStudents();
        for (Student x : students) {
            System.out.println(x);
        }
















    }
}
