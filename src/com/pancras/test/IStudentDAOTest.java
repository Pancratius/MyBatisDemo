package com.pancras.test;



import com.pancras.dao.IStudentDAO;
import com.pancras.dao.impl.StudentDAOImpl;

import com.pancras.domain.Student;
import org.junit.jupiter.api.Test;

import java.util.List;


class IStudentDAOTest {

    private IStudentDAO iStudentDAO = new StudentDAOImpl();

    @Test
    void testUpdate() {
        Student student = iStudentDAO.readOne(2L);
        student.setUName("woDR");
        iStudentDAO.update(student);
    }

    @Test
    void readAll() {
        List<Student> list = iStudentDAO.readAll();
        for (Student student : list) {
            System.out.println(student);
        }
    }

    @Test
    void readOne() {
        Student student = iStudentDAO.readOne(2L);
        System.out.println(student);
    }

    @Test
    void add() {
        Student student = new Student(null, "wuliq", 23);
        iStudentDAO.add(student);
    }

    @Test
    void delete() {
        iStudentDAO.delete(13L);
    }
}