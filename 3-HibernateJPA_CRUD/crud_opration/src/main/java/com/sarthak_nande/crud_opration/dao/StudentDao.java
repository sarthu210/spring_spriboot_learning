package com.sarthak_nande.crud_opration.dao;

import com.sarthak_nande.crud_opration.entity.Student;

import java.util.List;

public interface StudentDao {
     void save(Student theStudent);

      Student findById(Integer id);

      List<Student> findAll();

      void update(Student theStudent);

      void delete(Integer id);
}
