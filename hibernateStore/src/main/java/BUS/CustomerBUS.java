/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.CustomerDAL;
import Entity.customer;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class CustomerBUS {

    private List<customer> cusList;

    public CustomerBUS() {
        cusList = null;
    }

    public List<customer> getList() {
        return cusList;
    }

    public customer getCustomerById(String cusID) {
        for (customer cus : cusList) {
            if (cus.getCustomerID()== Integer.parseInt(cusID)) {
                return cus;
            }
        }
        return null;
    }

    public void list() {
        CustomerDAL cusDAL = new CustomerDAL();
        cusList = new ArrayList<>();
        cusList = cusDAL.loadCustomer();
    }

    public void add(customer customer) {
        CustomerDAL cusDAL = new CustomerDAL();
        cusDAL.addCustomer(customer);
        cusList.add(customer);
    }

    public void delete(customer customer) {
        for (customer cus : cusList) {
            if (cus.getCustomerID()== customer.getCustomerID()) {
                cusList.remove(cus);
                CustomerDAL cusDAL = new CustomerDAL();
                cusDAL.deleteCustomer(customer);
                return;
            }
        }
    }

    public void set(customer customer) {
        for (int i = 0; i < cusList.size(); i++) {
            if (cusList.get(i).getCustomerID()== customer.getCustomerID()) {
                cusList.set(i, customer);
                CustomerDAL cusDAL = new CustomerDAL();
                cusDAL.updateCustomer(customer);
                return;
            }
        }
    }
}
