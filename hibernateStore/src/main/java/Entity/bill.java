
package Entity;

import javax.persistence.*;
import lombok.Data;


@Data
@Entity
@Table
public class bill{
    @Id
    private int billID;
    @Column 
    private int customerID;
    @Column
    private String date;
    @Column
    private float total;
    @Column
    private String note;

    public bill(int customerID, String date, float total, String note) {
        this.customerID = customerID;
        this.date = date;
        this.total = total;
        this.note = note;
    }
    
    public bill(){}
}
