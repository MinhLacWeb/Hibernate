/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.customer;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
/**
 *
 * @author Lộc
 */
public class CustomerDAL {
    private Session session;
    
    public CustomerDAL()
    {
        session = HibernateUtils.getSessionFactory().openSession();
    }
    
    public List loadCustomer() {
        List<customer> customer;
        session.beginTransaction();
        customer = session.createQuery("FROM customer", customer.class).list();
        session.getTransaction().commit();
        return customer;

    }
    
    public void addCustomer(customer c)
    {
        session.save(c);  
    }
    
    public void updateCustomer(customer c)
    {
        session.update(c);
    }
    
    public void deleteCustomer(customer c)
    {
        session.delete(c);
    }
}
