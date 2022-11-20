/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.billdetail;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
/**
 *
 * @author Lộc
 */
public class BilldetailDAL {
    private Session session;
    
    public BilldetailDAL()
    {
        session = HibernateUtils.getSessionFactory().openSession();
    }
    
    public List loadBilldetail() {
        List<billdetail> billdetail;
        session.beginTransaction();
        billdetail = session.createQuery("FROM billdetail", billdetail.class).list();
        session.getTransaction().commit();
        return billdetail;

    }
    
    public void addBilldetail(billdetail b)
    {
        session.save(b);  
    }
    
    public void updateBilldetail(billdetail b)
    {
        session.update(b);
    }
    
    public void deleteBilldetail(billdetail b)
    {
        session.delete(b);
    }
}
