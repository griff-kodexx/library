package Entity;

import javax.persistence.*;

@NamedQueries(
        {
                @NamedQuery(name="findAllAddresses",
                        query="SELECT address FROM Address address")
        }

)

@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String email;
    @Column
    private String location;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
