package Bean;

import DAO.Crud;
import javax.ejb.EJB;

public class LibrarianBean {

    @EJB(mappedName = "issuance")
    private Crud issuanceCrud;

    private boolean issueBook(){
        return false;
    }


}
















/// /TO DO
//named query / named queries
//stored procedures