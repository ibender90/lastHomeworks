package ru.gb.homeworks.lesson5;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDao {

    private Session currentSession;
    private Transaction currentTransaction;

    public Session openCurrentSession() {
        currentSession = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return currentSession;
    }

    public void closeCurrentSession() {
        currentSession.close();
    }

    public Session openCurrentSessionWithTransaction() {
        currentSession = openCurrentSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSessionWithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }

    public StudentEntity findById(Long id) {
        return currentSession.get(StudentEntity.class, id);
    }

    public void save(StudentEntity studentEntity){
        currentSession.save(studentEntity);
    }

    public void update(StudentEntity studentEntity){
        currentSession.update(studentEntity);
    }

    public List<StudentEntity> findAll(){
        return (List<StudentEntity>) currentSession.createQuery("from StudentEntity").list();
    }

    public void delete(StudentEntity studentEntity){
        currentSession.delete(studentEntity);
    }
}
