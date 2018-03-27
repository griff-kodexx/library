package Entity;

import javax.persistence.*;
import java.util.List;


@NamedQueries(
        {
                @NamedQuery(name="findAllLibrarians",
                        query="SELECT book FROM Book book")
        }

)

@Entity
@Table(name = "librarians")
public class Librarian {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;
    @OneToOne
    private Address address;
    @OneToMany
    private List<Issuance> issuanceList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Issuance> getIssuanceList() {
        return issuanceList;
    }

    public void setIssuanceList(List<Issuance> issuanceList) {
        this.issuanceList = issuanceList;
    }
}
