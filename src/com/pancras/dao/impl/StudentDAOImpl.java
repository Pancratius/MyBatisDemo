package com.pancras.dao.impl;


import com.pancras.dao.IStudentDAO;
import com.pancras.domain.Student;
import com.pancras.mapper.StudentMapper;
import com.pancras.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


/**
 * @author Pancras
 */
public class StudentDAOImpl implements IStudentDAO {

    @Override
    public void update(Student student) {
        SqlSession session = MybatisUtil.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        mapper.update(student);
//        session.update("com.pancras.domain.StudentMapper.update", student);
        session.commit();
        session.close();

    }

    @Override
    public List<Student> readAll() {
        SqlSession session = MybatisUtil.getSession();
        List<Student> list = session.selectList("com.pancras.domain.StudentMapper.selectAll");
        session.close();
        return list;
    }

    @Override
    public Student readOne(Long id) {
        SqlSession session =  MybatisUtil.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student student = mapper.selectOne(id);
//        Student student = session.selectOne("com.pancras.domain.StudentMapper.selectOne", id);
        session.close();
        return student;
    }

    @Override
    public void add(Student student) {
        SqlSession session = MybatisUtil.getSession();
        session.insert("com.pancras.domain.StudentMapper.add", student);
        session.commit();
        session.close();
    }

    @Override
    public void delete(Long id) {
        SqlSession session = MybatisUtil.getSession();
        session.insert("com.pancras.domain.StudentMapper.delete", id);
        session.commit();
        session.close();
    }
}
