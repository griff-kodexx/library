package DAO;

import Entity.Book;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RequestScoped
@Named("book")
public class BookDAO implements Crud<Book>{

    @PersistenceContext
    private EntityManager entityManager;

    public boolean create(Book book) {
        try{
            entityManager.persist(book);
        } catch (Exception ex){
            System.out.println("The following exception occurred");
            System.out.println(ex);
            return false;
        }
        return true;
    }

    public Book getById(long bookId) {
        Book book;
        try{
            book = entityManager.find(Book.class, bookId);
        }catch(Exception ex){
            System.out.println("The following exception occured");
            System.out.println(ex.getMessage());
            return null;
        }
        return book;
    }

    public boolean update(Book book) {
        try {
            entityManager.merge(book);
        }catch (Exception e){
            System.out.println("The following exception occured");
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean delete(Book book) {
        try{
            entityManager.remove(book);
        } catch (Exception ex){
            System.out.println("The following exception occurred");
            System.out.println(ex);
            return false;
        }
        return true;
    }

    public List<Book> getAll() {
        List<Book> bookList;
        try {
            bookList = entityManager.createNamedQuery("findAllBooks").getResultList();
        }catch (Exception ex){
            System.out.println("The following exception occurred");
            System.out.println(ex);
            return null;
        }

        return bookList;
    }
}
