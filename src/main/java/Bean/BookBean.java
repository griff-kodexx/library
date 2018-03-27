package Bean;

import DAO.Crud;
import Entity.Book;
import javax.ejb.EJB;
import java.util.List;

public class BookBean{

    @EJB(mappedName = "book")
    private Crud bookDAO;

    //add single book
    private boolean add(Book book){

       return bookDAO.create(book);
    }

    //add many books at once
    //mark this as a transaction
    private boolean addMany(Book book, int number){
        boolean status = true;
        for (int i=0;i<number;i++){
             if(!bookDAO.create(book)){  //ensure all books are added. should use transcaion
                 status = false;
             }
        }
        return status;
    }

    private boolean edit(Book book){
        return bookDAO.update(book);
    }

    private boolean remove(Book book){
        return bookDAO.delete(book);
    }

    private Book view(long bookId){
        return (Book) bookDAO.getById(bookId);

    }

    private List<Book> viewAll(){
        return bookDAO.getAll();
    }


}
