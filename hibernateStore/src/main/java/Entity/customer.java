
package Entity;

import javax.persistence.*;
import lombok.Data;


@Data
@Entity
@Table
public class customer {
    @Id
    private int customerID;
    @Column 
    private String full_name;
    @Column
    private String address;
    @Column
    private String city;

    public customer(String full_name, String address, String city) {
        this.full_name = full_name;
        this.address = address;
        this.city = city;
    }
    
    public customer(){}
}
