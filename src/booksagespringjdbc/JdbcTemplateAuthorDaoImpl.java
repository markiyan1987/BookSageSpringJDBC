
package booksagespringjdbc;

import java.util.Date;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;


public class JdbcTemplateAuthorDaoImpl implements AuthorDAO{
     private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate((javax.sql.DataSource) dataSource);
    }

    @Override
    public void createAuthor(String firstName, String lastName, Date age, String imagePath) {
        String SQL = "INSERT INTO authors (firstname, lastname, age, imagepath) VALUES (?,?,?,?)";

        jdbcTemplate.update(SQL, firstName, lastName, age, imagePath);
        System.out.println("Author successfully created.\nFirst Name: " + firstName + ";\nLast Name: " +
                lastName + ";\nAge: " + age + ";\nImage Path: " + imagePath + "\n");
    }

    @Override
    public Author getAuthorById(Integer id) {
         String SQL = "SELECT * FROM authors WHERE id = ?";
        Author author = (Author) jdbcTemplate.queryForObject(SQL, new Object[]{id}, new AuthorMapper());
        return author;
    }

    @Override
    public List listAuthor() {
        String SQL = "SELECT * FROM authors";
        List<Author> authors = jdbcTemplate.query(SQL, new AuthorMapper());
        return authors;
    }

    @Override
    public void removeAuthor(Integer id) {
         String SQL = "DELETE FROM authors WHERE id = ?";
        jdbcTemplate.update(SQL, id);
        System.out.println("Author with id: " + id + " successfully removed");
    }

    @Override
    public void updateAuthor(Integer id, String firstName, String lastName, Date age, String imagePath) {
         String SQL = "UPDATE authors SET firstname = ?, lastname = ?, age = ?, imagepath = ? WHERE id = ?";
        jdbcTemplate.update(SQL, firstName, lastName, age, imagePath, id);
        System.out.println("Author with id: " + id + " successfully updated.");
    }
    
}
