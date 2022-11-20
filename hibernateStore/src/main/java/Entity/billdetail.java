
package Entity;

import javax.persistence.*;
import lombok.Data;


@Data
@Entity
@Table
public class billdetail {
    @Id
    private int billdetailID;
    @Column 
    private int billID;
    @Column
    private int productID;
    @Column
    private int quantity;
    @Column
    private int price;

    public billdetail(int billID, int productID, int quantity, int price) {
        this.billID = billID;
        this.productID = productID;
        this.quantity = quantity;
        this.price = price;
    }
    
    public billdetail(){}
}
