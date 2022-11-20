/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.category;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;

public class CategoryDAL {
    private Session session;
    
    public CategoryDAL()
    {
        session = HibernateUtils.getSessionFactory().openSession();
    }
    
    public List loadCategory() {
        List<category> category;
        session.beginTransaction();
        category = session.createQuery("FROM category", category.class).list();
        session.getTransaction().commit();
        return category;

    }
    
    public void addCategory(category c)
    {
        session.save(c);  
    }
    
    public void updateCategory(category c)
    {
        session.update(c);
    }
    
    public void deleteCategory(category c)
    {
        session.delete(c);
    }
}
