package DAO;

import Entity.Librarian;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RequestScoped
@Named("librarian")
public class LibrarianDAO implements Crud<Librarian> {

    @PersistenceContext
    private EntityManager entityManager;

    public boolean create(Librarian librarian) {
        return false;
    }

    public Librarian getById(long id) {
        return null;
    }

    public boolean update(Librarian librarian) {
        return false;
    }

    public boolean delete(Librarian librarian) {
        return false;
    }

    public List<Librarian> getAll() {
        List<Librarian> librarianList;
        try{
            librarianList =  entityManager.createNamedQuery("findAllLibrarians").getResultList();
        }catch (Exception ex){
            System.out.println("The following exception occurred");
            System.out.println(ex);
            return null;
        }
        return librarianList;
     }
}
