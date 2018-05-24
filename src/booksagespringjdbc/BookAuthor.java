/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booksagespringjdbc;

/**
 *
 * @author karpj
 */
public class BookAuthor {

    @Override
    public String toString() {
        return "BookAuthor{" + "id=" + id + ", bookName=" + bookName + ", authorFirstName=" + authorFirstName + ", authorLastName=" + authorLastName + ", price=" + price + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    private int id;
    private String bookName;
    private String authorFirstName;
    private String authorLastName;
    private int price;
}
