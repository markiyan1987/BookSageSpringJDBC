
package booksagespringjdbc;


public class Book {

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + ", author_id=" + author_id + ", price=" + price + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
     private Integer id;
     private String name;
     private int author_id;    
     private int price;
     

       
   
    
    
    
}
