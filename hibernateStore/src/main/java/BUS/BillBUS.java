/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.BillDAL;
import Entity.bill;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class BillBUS {

    private List<bill> billList;

    public BillBUS() {
        billList = null;
    }

    public List<bill> getList() {
        return billList;
    }

    public bill getBillById(String bID) {
        for (bill b : billList) {
            if (b.getBillID()== Integer.parseInt(bID)) {
                return b;
            }
        }
        return null;
    }

    public void list() {
        BillDAL bDAL = new BillDAL();
        billList = new ArrayList<>();
        billList = bDAL.loadBill();
    }

    public void add(bill bill) {
        BillDAL bDAL = new BillDAL();
        bDAL.addBill(bill);
        billList.add(bill);
    }

    public void delete(bill bill) {
        for (bill b : billList) {
            if (b.getBillID()== bill.getBillID()) {
                billList.remove(b);
                BillDAL bDAL = new BillDAL();
                bDAL.deleteBill(bill);
                return;
            }
        }
    }

    public void set(bill bill) {
        for (int i = 0; i < billList.size(); i++) {
            if (billList.get(i).getBillID()== bill.getBillID()) {
                billList.set(i, bill);
                BillDAL bDAL = new BillDAL();
                bDAL.updateBill(bill);
                return;
            }
        }
    }
}
