package com.springapp.mvc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by angel on 30.03.14.
 */

@Repository
public class HibernateSpitterDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Transactional(readOnly = false)
    public void savestudent(Student student) {
       Session currentSession = sessionFactory.getCurrentSession();
      // Transaction transaction = currentSession.beginTransaction();
       currentSession.save(student);
      // transaction.commit();
         // Использует текущий сеанс
    }

}
