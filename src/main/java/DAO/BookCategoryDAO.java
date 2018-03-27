package DAO;

import Entity.BookCategory;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RequestScoped
@Named("bookCategory")
public class BookCategoryDAO implements Crud<BookCategory> {


    @PersistenceContext
    private EntityManager entityManager;

    public boolean create(BookCategory bookCategory) {

        try {
            entityManager.persist(bookCategory);
        }catch (Exception ex){
            System.out.println("The following exception occurred");
            System.out.println(ex);
            return false;
        }
        return true;
    }

    public BookCategory getById(long id) {
        return null;
    }

    public boolean update(BookCategory bookCategory) {
        return false;
    }

    public boolean delete(BookCategory bookCategory) {
        return false;
    }

    public List<BookCategory> getAll() {
        List<BookCategory> bookCategoryList;
        try {
            bookCategoryList = entityManager.createNamedQuery("findAllBookCategories").getResultList();
        }catch (Exception ex){
            System.out.println("The following exception occurred");
            System.out.println(ex);
            return null;
        }
        return bookCategoryList;
    }
}
