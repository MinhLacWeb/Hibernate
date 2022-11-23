
package Entity;

import javax.persistence.*;
import lombok.Data;


@Data
@Entity
@Table
public class product {
    @Id
    private int productID;
    @Column
    private int categoryID;
    @Column
    private String productName;
    @Column
    private int amount;
    @Column
    private float price;

    public product(int categoryID, String productName, int amount, float price) {
        this.categoryID = categoryID;
        this.productName = productName;
        this.amount = amount;
        this.price = price;
    }

    public product() {}
}
