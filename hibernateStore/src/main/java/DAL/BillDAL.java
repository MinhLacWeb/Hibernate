/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.bill;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
/**
 *
 * @author Lộc
 */
public class BillDAL {
    private Session session;
    
    public BillDAL()
    {
        session = HibernateUtils.getSessionFactory().openSession();
    }
    
    public List loadBill() {
        List<bill> bill;
        session.beginTransaction();
        bill = session.createQuery("FROM bill", bill.class).list();
        session.getTransaction().commit();
        return bill;

    }
    
    public void addBill(bill b)
    {
        session.save(b);  
    }
    
    public void updateBill(bill b)
    {
        session.update(b);
    }
    
    public void deleteBill(bill b)
    {
        session.delete(b);
    }
}
