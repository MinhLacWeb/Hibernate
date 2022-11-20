/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.OrderdetailDAL;
import Entity.orderdetail;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class OrderdetailBUS {

    private List<orderdetail> orderdetailList;

    public OrderdetailBUS() {
        orderdetailList = null;
    }

    public List<orderdetail> getList() {
        return orderdetailList;
    }

    public orderdetail getOrderdetailById(String oID) {
        for (orderdetail o : orderdetailList) {
            if (o.getOrderdetailID()== Integer.parseInt(oID)) {
                return o;
            }
        }
        return null;
    }

    public void list() {
        OrderdetailDAL oDAL = new OrderdetailDAL();
        orderdetailList = new ArrayList<>();
        orderdetailList = oDAL.loadOrderdetail();
    }

    public void add(orderdetail orderdetail) {
        OrderdetailDAL oDAL = new OrderdetailDAL();
        oDAL.addOrderdetail(orderdetail);
        orderdetailList.add(orderdetail);
    }

    public void delete(orderdetail orderdetail) {
        for (orderdetail o : orderdetailList) {
            if (o.getOrderID()== orderdetail.getOrderID()) {
                orderdetailList.remove(o);
                OrderdetailDAL oDAL = new OrderdetailDAL();
                oDAL.deleteOrderdetail(orderdetail);
                return;
            }
        }
    }

    public void set(orderdetail orderdetail) {
        for (int i = 0; i < orderdetailList.size(); i++) {
            if (orderdetailList.get(i).getOrderID()== orderdetail.getOrderdetailID()) {
                orderdetailList.set(i, orderdetail);
                OrderdetailDAL oDAL = new OrderdetailDAL();
                oDAL.updateOrderdetail(orderdetail);
                return;
            }
        }
    }
}
