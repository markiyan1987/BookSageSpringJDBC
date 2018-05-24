/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booksagespringjdbc;

import java.util.List;
import javax.sql.DataSource;


public interface BookAuthorDAO {
    public void setDataSource(DataSource dataSource);

    public List listBookAuthor();    
}
