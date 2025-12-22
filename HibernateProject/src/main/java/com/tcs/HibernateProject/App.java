package com.tcs.HibernateProject;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tcs.HibernateProject.beans.Student;
import com.tcs.HibernateProject.databaseConfig.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sf = HibernateUtil.getSf();
    	Session session = sf.openSession();    	
    	Transaction txn = null;
    	
    	// CREATE
//    	Student s = new Student();
//    	s.setName("Ruchitha");
//    	s.setMarks(89);
//    	
//    	try {    		
//    		txn = session.beginTransaction();
//    		session.persist(s);
//    		txn.commit();
//    	} catch (Exception e) {
//    		if (txn != null) {
//    			txn.rollback();
//    		}
//    		System.out.println("Error happened, Transaction rollbacked");
//    	}
    	
    	
    	// READ ALL
    	
//    	txn = null;
//    	try {    		
//    		txn = session.beginTransaction();
//    		List<Student> ans = session.createQuery("from Student", Student.class).getResultList();
//    		System.out.println(ans);
//    		txn.commit();
//    	} catch (Exception e) {
//    		if (txn != null) {
//    			txn.rollback();
//    		}
//    		System.out.println("Error happened, Transaction rollbacked");
//    	} finally {
//    		session.close();
//    	}
    	
    	
    	// READ SPECIFIC ONE
    	
//    	txn = null;
//    	try {    		
//    		txn = session.beginTransaction();
//    		Student ans = session.find(Student.class, 1);
//    		System.out.println(ans);
//    		txn.commit();
//    	} catch (Exception e) {
//    		if (txn != null) {
//    			txn.rollback();
//    		}
//    		System.out.println("Error happened, Transaction rollbacked");
//    	} finally {
//    		session.close();
//    	}
    	
    	
    	// UPDATE
    	
//    	txn = null;
//    	try {    		
//    		txn = session.beginTransaction();
//    		Student ans = session.find(Student.class, 1);
//    		ans.setMarks(100);
//    		txn.commit();
//    	} catch (Exception e) {
//    		if (txn != null) {
//    			txn.rollback();
//    		}
//    		System.out.println("Error happened, Transaction rollbacked");
//    	} finally {
//    		session.close();
//    	}
    	
    	
    	// DELETE
    	
    	txn = null;
    	try {    		
    		txn = session.beginTransaction();
    		Student ans = session.find(Student.class, 1);
    		if (ans != null) session.remove(ans);
    		txn.commit();
    	} catch (Exception e) {
    		if (txn != null) {
    			txn.rollback();
    		}
    		System.out.println("Error happened, Transaction rollbacked");
    	} finally {
    		session.close();
    	}

    }
}
