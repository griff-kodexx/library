package DAO;

import Entity.Address;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RequestScoped
@Named("adddress")

public class AddressDAO implements Crud<Address> {

    @PersistenceContext
    private EntityManager entityManager;


    public boolean create(Address address) {
       try{
           entityManager.persist(address);
       } catch (Exception ex){
           System.out.println("The following exception occurred");
           System.out.println(ex);
           return false;
       }
        return true;
    }

    public Address getById(long id) {
        Address address;
        try {
            address = entityManager.find(Address.class, id);
        }catch(Exception ex){
            System.out.println("The following exception occured");
            System.out.println(ex.getMessage());
            return null;
        }

        return address;
    }

    public boolean update(Address address) {
        try{
            entityManager.merge(address);
        }catch (Exception e){
            System.out.println("The following exception occured");
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean delete(Address address) {
        try {
            entityManager.remove(address);
        }catch (Exception ex){
            System.out.println("The following exception occurred");
            System.out.println(ex);
            return false;
        }
        return true;
    }

    public List<Address> getAll() {
        List<Address> addressList;
        try {
            addressList = entityManager.createNamedQuery("findAllAddresses").getResultList();
        }catch (Exception ex){
            System.out.println("The following exception occurred");
            System.out.println(ex);
            return null;
        }

        return addressList;
    }
}
