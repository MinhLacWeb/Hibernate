
package DAL;

import Entity.product;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class ProductDAL {
    private Session session;
    
    public ProductDAL()
    {
        session = HibernateUtils.getSessionFactory().openSession();
    }
    
    public List loadProduct() {
        List<product> product;
        session.beginTransaction();
        product = session.createQuery("FROM product", product.class).list();
        session.getTransaction().commit();
        return product;
    }
    
    public void addProduct(product c)
    {
        session.save(c);  
    }
    
    public void updateProduct(product c)
    {
        session.update(c);
    }
    
    public void deleteProduct(product c)
    {
        session.delete(c);
    }
}
