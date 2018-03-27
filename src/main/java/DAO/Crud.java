package DAO;

import java.util.List;

public abstract class Crud<T> {


     boolean create(T t);
     T getById(long id);
     boolean update(T t);
     boolean delete(T t);
     List<T> getAll();

}
