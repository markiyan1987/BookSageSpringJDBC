
package booksagespringjdbc;

import java.util.List;
import javax.activation.DataSource;

public interface BookDAO {
     public void setDataSource(DataSource dataSource);

    public void createBook(Author author, String name, int price, String imagePath);

    public Author getBookById(Integer id);

    public List listBook();

    public void removeBook(Integer id);

    public void updateBook(Integer id, Author author, String name, int price, String imagePath);
}
