package DAO;

import Entity.Issuance;

import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RequestScoped
@Named("issuance")
public class IssuanceDAO implements Crud<Issuance> {

    @PersistenceContext
    EntityManager entityManager;

    public boolean create(Issuance issuance) {
        return false;
    }

    public Issuance getById(long id) {
        return null;
    }

    public boolean update(Issuance issuance) {
        return false;
    }

    public boolean delete(Issuance issuance) {
        return false;
    }

    public List<Issuance> getAll() {
        List<Issuance> issuanceList;
        try {
            issuanceList = entityManager.createNamedQuery("findAllIssuances").getResultList();
        } catch  (Exception ex){
            System.out.println("The following exception occurred");
            System.out.println(ex);
            return null;
        }

        return issuanceList;
    }
}
