/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booksagespringjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class BookMapper implements RowMapper<Book> {

    

    @Override
    public Book mapRow(ResultSet rs, int i) throws SQLException {
        Book book = new Book();
        book.setId(rs.getInt(1));
        book.setName(rs.getString(2));
        book.setAuthor_id(rs.getInt(3));
        book.setPrice(rs.getInt(4));        
        return book;
        
    }
    
}
