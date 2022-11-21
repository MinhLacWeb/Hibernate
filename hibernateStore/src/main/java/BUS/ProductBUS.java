
package BUS;

import DAL.ProductDAL;
import java.util.List;
import Entity.product;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class ProductBUS {
    private List<product> proList;
    
    public ProductBUS(){
        proList = null;
    }
    
    public List<product> getList(){
        return proList;
    }
    
    public product getProductById(String proID) {
        for (product pro : proList) {
            if (pro.getProductID()== Integer.parseInt(proID)) {
                return pro;
            }
        }
        return null;
    }
    
    public void list() {
        ProductDAL proDAL = new ProductDAL();
        proList = new ArrayList<>();
        proList = proDAL.loadProduct();
    }
    
    public void add(product product) {
        ProductDAL cusDAL = new ProductDAL();
        cusDAL.addProduct(product);
        proList.add(product);
    }
    
    public void delete(product product) {
        for (product pro : proList) {
            if (pro.getProductID()== product.getProductID()) {
                proList.remove(pro);
                ProductDAL cusDAL = new ProductDAL();
                cusDAL.deleteProduct(product);
                return;
            }
        }
    }
    
    public void set(product product) {
        for (int i = 0; i < proList.size(); i++) {
            if (proList.get(i).getProductID()== product.getProductID()) {
                proList.set(i, product);
                ProductDAL proDAL = new ProductDAL();
                proDAL.updateProduct(product);
                return;
            }
        }
    }
}
