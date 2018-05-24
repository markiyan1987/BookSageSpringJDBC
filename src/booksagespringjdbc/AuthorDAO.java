/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booksagespringjdbc;

import java.util.Date;
import java.util.List;
import javax.sql.DataSource;


/**
 *
 * @author markiyan
 */
public interface AuthorDAO {
    public void setDataSource(DataSource dataSource);

    public void createAuthor(String firstName, String lastName, Date age, String imagePath);

    public Author getAuthorById(Integer id);

    public List listAuthor();

    public void removeAuthor(Integer id);

    public void updateAuthor(Integer id, String firstName, String lastName, Date age, String imagePath);
}
