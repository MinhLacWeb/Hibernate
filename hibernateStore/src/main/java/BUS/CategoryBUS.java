/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.CategoryDAL;
import Entity.category;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class CategoryBUS {
    private List<category> cateList;
    
    public CategoryBUS() {
        cateList = null;
    }

    public List<category> getList() {
        return cateList;
    }
    
    public void list() {
        CategoryDAL cateDAL = new CategoryDAL();
        cateList = new ArrayList<>();
        cateList = cateDAL.loadCategory();
    }

    public category getCategoryById(String cateID) {
        for (category cate : cateList) {
            if (cate.getCategoryID()== Integer.parseInt(cateID)) {
                return cate;
            }
        }
        return null;
    }
    
    
    
    public boolean CheckCategoryID(int categoryID)
    {
        for(category cate : cateList)
        {
            if(cate.getCategoryID()== categoryID)
            {
                return true;
            }
        }
        return false;
    }
    
    public void add(category category) {
        CategoryDAL cateDAL = new CategoryDAL();
        cateDAL.addCategory(category);
        cateList.add(category);
    }

    public void delete(category category) {
        for (category cate : cateList) {
            if (cate.getCategoryID()== category.getCategoryID()) {
                cateList.remove(cate);
                CategoryDAL cateDAL = new CategoryDAL();
                cateDAL.deleteCategory(category);
                return;
            }
        }
    }

    public void set(category category) {
        for (int i = 0; i < cateList.size(); i++) {
            if (cateList.get(i).getCategoryID()== category.getCategoryID()) {
                cateList.set(i, category);
                CategoryDAL cateDAL = new CategoryDAL();
                cateDAL.updateCategory(category);
                return;
            }
        }
    }
    
    public ArrayList<category> search(String categoryID, String name, String description)
    {
        ArrayList<category> search = new ArrayList<>();
        categoryID = categoryID.isEmpty()?categoryID = "": categoryID;
        name = name.isEmpty()?name = "": name;
        description = description.isEmpty()?description = "": description;
        for(category c: cateList)
        {
            if( Integer.toString(c.getCategoryID()).contains(categoryID) && 
                c.getName().contains(name) && 
                (c.getDescription()).contains(description))
            {
                search.add(c);
            }
        }
        return search;
    }
    
    
    
}
