
package booksagespringjdbc;



import java.util.Date;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookSageSpringJDBC {

    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringXMLConfig.xml");

        JdbcTemplateAuthorDaoImpl jdbcTemplateAuthorDao = (JdbcTemplateAuthorDaoImpl) context.getBean("jdbcTemplateAuthorDao");
        JDBCTemplateBookAuthorDaoImpl jDBCTemplateBookAuthorDaoImpl = (JDBCTemplateBookAuthorDaoImpl)context.getBean("jdbcTemplateBookAuthorDao");

        System.out.println("========Creating new records to DB========");
        jdbcTemplateAuthorDao.createAuthor("markiyan", "karpyak", new Date(), "path");
        jdbcTemplateAuthorDao.createAuthor("max", "karpyak", new Date(), "path");
        jdbcTemplateAuthorDao.createAuthor("julia", "karpyak", new Date(), "path");

        System.out.println("========Authors List========");
        List<Author> authors = jdbcTemplateAuthorDao.listAuthor();
        for (Author author : authors) {
            System.out.println(author);
        }

        System.out.println("========Some changes to DB========");
        jdbcTemplateAuthorDao.updateAuthor(6,"max", "karpyak", new Date(), "path");
        jdbcTemplateAuthorDao.removeAuthor(32);

        System.out.println("========Final Authors List========");
        List<Author> finalAuthors = jdbcTemplateAuthorDao.listAuthor();
        for (Author author : finalAuthors) {
            System.out.println(author);
        }
        
        System.out.println("========Book Authors List========");
        
        List<BookAuthor> bookAuthorsList = jDBCTemplateBookAuthorDaoImpl.listBookAuthor();
        for(BookAuthor bookAuthor:bookAuthorsList){
            System.out.println(bookAuthor);
        }
    }
    
}
