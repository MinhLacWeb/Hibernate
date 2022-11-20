/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.orderdetail;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
/**
 *
 * @author Lộc
 */
public class OrderdetailDAL {
    private Session session;
    
    public OrderdetailDAL()
    {
        session = HibernateUtils.getSessionFactory().openSession();
    }
    
    public List loadOrderdetail() {
        List<orderdetail> orderdetail;
        session.beginTransaction();
        orderdetail = session.createQuery("FROM orderdetail", orderdetail.class).list();
        session.getTransaction().commit();
        return orderdetail;

    }
    
    public void addOrderdetail(orderdetail o)
    {
        session.save(o);  
    }
    
    public void updateOrderdetail(orderdetail o)
    {
        session.update(o);
    }
    
    public void deleteOrderdetail(orderdetail o)
    {
        session.delete(o);
    }
}
