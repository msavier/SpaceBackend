package org.studentspace.db.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Transient;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class HibernateGenericDao {
    private Session session;
    private Transaction txn;
    @Autowired
    protected SessionFactory sessionFactory;
    
    public HibernateGenericDao() {
        
    }
    
    protected void inialize() throws HibernateException {
        session = sessionFactory.openSession();
        txn = session.beginTransaction();
    }

    protected Object create(Object obj) {
    	 inialize();
    	 try {         
        	session.save(obj);
            txn.commit();
        } catch (HibernateException e) {
        	handleException(e);
        } finally {
        	session.close();
        }
        return obj;
    }
    
    protected Object update(Object obj) {
       inialize();
   	   try {         
           session.update(obj);
           txn.commit();
       } catch (HibernateException e) {
       	handleException(e);
       } finally {
       	session.close();
       }
       return obj;
   }
    
    protected void handleException(HibernateException e) throws BusinessLayerException {
    	txn.rollback();
        throw new BusinessLayerException(e);
    }

    protected Object delete(Object obj) {        
    	inialize();
    	try {           
            session.delete(obj);
            txn.commit();
        } catch (HibernateException e) {
        	handleException(e);
        } finally {
        	session.close();
        }
		return obj;
    }

    protected Object find(Class clazz, long id) {
    	inialize();
        Object obj = null;
        try {           
            obj = session.get(clazz, id);
            txn.commit();
        } catch (HibernateException e) {
        	handleException(e);
        } finally {
        	session.close();
        }
        return obj;
    }

    protected List findAll(Class clazz) {
        List objects = null;
        inialize();
        try {
            
            Query query = session.createQuery("from " + clazz.getName());
            objects = query.list();
            txn.commit();
        } catch (HibernateException e) {
        	handleException(e);
        } finally {
        	session.close();
        }
        return objects;
    }
    
   
}
