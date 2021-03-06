package com.pancras.dao;


import com.pancras.domain.Student;

import java.util.List;

/**
 * @author Pancras
 */
public interface IStudentDAO {

    /**
     * 更新
     * @param student
     */
    void update(Student student);

    /**
     * 获取所有学生信息
     * @return 学生集合
     */
    List<Student> readAll();

    /**
     * 通过学生id 获取学生信息
     * @param id 学生ID
     * @return 学生
     */
    Student readOne(Long id);

    /**
     * 增加学生信息
     * @param student
     */
    void add(Student student);

    /**
     * 通过学生id 删除学生信息
     * @param id
     */
    void delete(Long id);
}
