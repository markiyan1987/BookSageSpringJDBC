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
 * @author markiyan
 */
public class AuthorMapper implements RowMapper<Author> {

    

    @Override
    public Author mapRow(ResultSet rs, int i) throws SQLException {
        Author author = new Author();
        author.setId(rs.getInt(1));
        author.setFirstName(rs.getString(2));
        author.setLastName(rs.getString(3));
        author.setAge(rs.getDate(4));
        author.setImagePath(rs.getString(5));
        return author;
        
    }
    
}
