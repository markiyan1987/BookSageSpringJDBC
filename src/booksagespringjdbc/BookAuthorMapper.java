/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booksagespringjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author karpj
 */
public class BookAuthorMapper implements RowMapper<BookAuthor>{

    @Override
    public BookAuthor mapRow(ResultSet rs, int i) throws SQLException {
        BookAuthor book = new BookAuthor();
        book.setId(rs.getInt("id"));
        book.setBookName(rs.getString("name"));
        book.setAuthorFirstName(rs.getString("firstname"));
        book.setAuthorLastName(rs.getString("lastname"));
        book.setPrice(rs.getInt("price"));        
        return book;
        
    }
    
}
