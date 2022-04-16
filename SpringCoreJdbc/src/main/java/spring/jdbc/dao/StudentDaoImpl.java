package spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import spring.jdbc.dao.StudentDao;
import spring.jdbc.entities.Student;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;
    private RowMapperImpl rowMapper;

    public RowMapperImpl getRowMapper() {
        return rowMapper;
    }

    public void setRowMapper(RowMapperImpl rowMapper) {
        this.rowMapper = rowMapper;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {

        String query = "insert into" +
                " student(id,name,city)" +
                "values(?,?,?)";
        int res = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());

        return res;

    }

    @Override
    public int change(Student student) {

        String query = "update student " +
                "set name = ?, " +
                "city = ? " +
                "where id = ?";

        int res = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
        return res;
    }

    @Override
    public int remove(Student student) {

        String query = "delete from student " +
                "where id = ? ";

        int res = this.jdbcTemplate.update(query,student.getId());
        return res;
    }

    @Override
    public Student getStudent(int id) {

        String query = "select * " +
                "from student " +
                "where id = ?";

        Student  student = jdbcTemplate.queryForObject(query,rowMapper,id);

        return student;
    }

    @Override
    public List<Student> getStudents() {

        String query = "select * " +
                "from student ";

        List<Student> students = jdbcTemplate.query(query,rowMapper);
        return students;
    }
}
