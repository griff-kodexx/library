package Entity;


import javax.persistence.*;
import java.util.List;

@NamedQueries(
        {
                @NamedQuery(name="findAllBookCategories",
                        query="SELECT bookCategory FROM BookCategory bookCategory")
        }

)

@Entity
@Table(name = "bookCategories")
public class BookCategory {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @OneToMany
    private List<Book> bookList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
