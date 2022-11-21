/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import javax.persistence.*;
import lombok.Data;


@Data
@Entity
@Table
public class category {
    @Id
    private int categoryID;
    @Column 
    private String name;
    @Column
    private String description;

    public category (int categoryID, String name, String description) {
        this.categoryID = categoryID;
        this.name = name;
        this.description = description;
        
    }
    
    public category(){}

  
}
