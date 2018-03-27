package DAO;

import Entity.Reader;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@RequestScoped
@Named("reader")
public class ReaderDAO implements Crud<Reader> {

    @PersistenceContext
    private EntityManager entityManager;

    public boolean create(Reader reader) {
        return false;
    }

    public Reader getById(long id) {
        return null;
    }

    public boolean update(Reader reader) {
        return false;
    }

    public boolean delete(Reader reader) {
        return false;
    }

    public List<Reader> getAll() {
        List<Reader> readerList;
        try{
            readerList = entityManager.createNamedQuery("findAllReaders").getResultList();
        }catch (Exception ex){
            System.out.println("The following exception occurred");
            System.out.println(ex);
            return null;
        }
        return readerList;
    }
}
