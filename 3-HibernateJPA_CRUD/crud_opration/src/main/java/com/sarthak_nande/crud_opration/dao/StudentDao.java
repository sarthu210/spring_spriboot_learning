package com.sarthak_nande.crud_opration.dao;

import com.sarthak_nande.crud_opration.entity.Student;

public interface StudentDao {
     void save(Student theStudent);

      Student findById(Integer id);
}
