
package booksagespringjdbc;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Author {

    @Override
    public String toString() {
        return "Author{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", imagePath=" + imagePath + ", bookses=" + bookses + '}';
    }
    private Integer id;
     private String firstName;
     private String lastName;
     private Date age;
     private String imagePath;
     private Set bookses = new HashSet(0);

    
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Date getAge() {
        return this.age;
    }
    
    public void setAge(Date age) {
        this.age = age;
    }
    public String getImagePath() {
        return this.imagePath;
    }
    
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    public Set getBookses() {
        return this.bookses;
    }
    
    public void setBookses(Set bookses) {
        this.bookses = bookses;
    }
}
