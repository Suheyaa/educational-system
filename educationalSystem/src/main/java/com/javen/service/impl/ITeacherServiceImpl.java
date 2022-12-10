package com.javen.service.impl;

import com.javen.dao.TeacherDao;
import com.javen.model.Teacher;
import com.javen.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mango
 * @date 2022/12/05 21:22
 */
@Service
public class ITeacherServiceImpl implements ITeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Override
    public List<Teacher> findAll() {
        return teacherDao.findAll();
    }

    @Override
    public List<Teacher> findByName(String name) {
        return teacherDao.findByName(name);
    }

    @Override
    public Integer addTeacher(Teacher teacher) {
        return teacherDao.addTeacher(teacher);
    }

    @Override
    public Integer deleteTeacher(Teacher teacher) {
        return teacherDao.deleteTeacher(teacher);
    }

    @Override
    public Integer updateTeacher(Teacher teacher) {
        return teacherDao.updateTeacher(teacher);
    }
}