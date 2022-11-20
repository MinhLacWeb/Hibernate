/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.BilldetailDAL;
import Entity.billdetail;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class BilldetailBUS {

    private List<billdetail> billdetailList;

    public BilldetailBUS() {
        billdetailList = null;
    }

    public List<billdetail> getList() {
        return billdetailList;
    }

    public billdetail getBilldetailById(String bID) {
        for (billdetail b : billdetailList) {
            if (b.getBilldetailID()== Integer.parseInt(bID)) {
                return b;
            }
        }
        return null;
    }

    public void list() {
        BilldetailDAL bDAL = new BilldetailDAL();
        billdetailList = new ArrayList<>();
        billdetailList = bDAL.loadBilldetail();
    }

    public void add(billdetail billdetail) {
        BilldetailDAL bDAL = new BilldetailDAL();
        bDAL.addBilldetail(billdetail);
        billdetailList.add(billdetail);
    }

    public void delete(billdetail billdetail) {
        for (billdetail b : billdetailList) {
            if (b.getBilldetailID()== billdetail.getBilldetailID()) {
                billdetailList.remove(b);
                BilldetailDAL bDAL = new BilldetailDAL();
                bDAL.deleteBilldetail(billdetail);
                return;
            }
        }
    }

    public void set(billdetail billdetail) {
        for (int i = 0; i < billdetailList.size(); i++) {
            if (billdetailList.get(i).getBilldetailID()== billdetail.getBilldetailID()) {
                billdetailList.set(i, billdetail);
                BilldetailDAL bDAL = new BilldetailDAL();
                bDAL.updateBilldetail(billdetail);
                return;
            }
        }
    }
}
