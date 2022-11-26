package DAL;

import Entity.product;
import Entity.bill;
import Entity.billdetail;
import java.util.List;


import org.hibernate.Session;

public class StatTrak {
    private Session session;

    public StatTrak(){ session = HibernateUtils.getSessionFactory().openSession();}

    // Normal initialize
    // Load binh thuong
    public  List loadBill(){
        List<bill>bill;
        session.beginTransaction();
        bill = session.createQuery("FROM bill", bill.class).list();
        session.getTransaction().commit();
        return  bill;
    }

    // Get the total revenue sold
    // Lay tong cong gia tri da ban ra
    public bill totalSold(){
        List<bill>bill;
        session.beginTransaction();
        bill = session.createQuery("select sum(total) from bill", bill.class).list(); // Custome Querry
        session.getTransaction().commit();
        return bill.get(0);
    }

    // Get the Most Expensive Item in the Inventory
    // Lay ra mon do dat tien nhat
    public product mostExItem(){
        List<product>product;
        session.beginTransaction();
        product= session.createQuery("select max(Price) from product", product.class).list(); //Custom query
        session.getTransaction().commit();
        return product.get(0);

    }

    // Get the cheapest item in the inventory
    // Lay ra san pham re nhat
    public product mostChItem(){
        List<product>product;
        session.beginTransaction();
        product= session.createQuery("select min(Price) from product", product.class).list(); //Custom query
        session.getTransaction().commit();
        return product.get(0);

    }
    // get the numbers of Bill.
    // Lay ra tong so don hang.
    public bill numberOfBill(){
        List<bill>bill;
        session.beginTransaction();
        bill = session.createQuery("select count(billID) from bill", bill.class).list(); // Custome Querry
        session.getTransaction().commit();
        return bill.get(0);
    }

    // Get the sold item number by ID.
    // Dem so san pham co id la ID da duoc ban ra

    public billdetail numOfSoldItem(int ID){
        List<billdetail>billdetail;
        session.beginTransaction();
        billdetail= session.createQuery("select count(productID) from billdetail where productID=:i", billdetail.class).setParameter("i",ID).list(); //Custom quer
        session.getTransaction().commit();
        return billdetail.get(0);
    }
}
