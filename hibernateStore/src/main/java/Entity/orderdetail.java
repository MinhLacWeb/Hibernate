
package Entity;

import javax.persistence.*;
import lombok.Data;


@Data
@Entity
@Table
public class orderdetail {
    @Id
    private int orderdetailID;
    @Column 
    private int orderID;
    @Column
    private int productID;
    @Column
    private int quantity;
    @Column
    private int price;

    public orderdetail(int orderID, int productID, int quantity, int price) {
        this.orderID = orderID;
        this.productID = productID;
        this.quantity = quantity;
        this.price = price;
    }
    
    public orderdetail(){}
}
