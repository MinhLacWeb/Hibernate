
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
    private String first_name;
    @Column 
    private String last_name;
    @Column
    private String address;
    @Column
    private String city;

    public customer(String first_name,String last_name, String address, String city) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
    }
    
    public customer(){}
}
