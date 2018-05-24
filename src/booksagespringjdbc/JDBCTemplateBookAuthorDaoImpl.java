/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booksagespringjdbc;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author karpj
 */
public class JDBCTemplateBookAuthorDaoImpl implements BookAuthorDAO{
     private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate((javax.sql.DataSource) dataSource);
    }

    @Override
    public List listBookAuthor() {
        String SQL = "SELECT books.id, books.name, authors.firstname, authors.lastname, books.price  FROM books JOIN authors ON books.author_id = authors.id";
        List<BookAuthor> bookAuthor = jdbcTemplate.query(SQL, new BookAuthorMapper());
        return bookAuthor;
    }
    
}
