package com.sarthak_nande.crud_opration.dao;

import com.sarthak_nande.crud_opration.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentsDaoImpl implements StudentDao{


    private EntityManager entityManager;

    @Autowired
    public StudentsDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll(){
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student" , Student.class);
        return theQuery.getResultList();
    }
}
