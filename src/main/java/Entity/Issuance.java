package Entity;

import javax.persistence.*;
import java.util.Date;

@NamedQueries(
        {
                @NamedQuery(name="findAllIssuances",
                        query="SELECT issuance FROM Issuance issuance")
        }

)

@Entity
@Table(name = "issuances")
public class Issuance {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne
    private Librarian librarian;
    @OneToOne
    private Reader reader;
    @OneToOne
    private Book book;
    @Column
    private Date issueDate;
    @Column
    private Date dueDate;
    @Column
    private Date returnDate;
    @Column
    private Double amountDue;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(Double amountDue) {
        this.amountDue = amountDue;
    }
}
