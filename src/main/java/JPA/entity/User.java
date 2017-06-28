package JPA.entity;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

/**
 * Created by Rohith on 6/28/2017.
 */
@Entity
public class User {
    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String id;
    private String firstName, lastName;
    @Column(unique = true)
    private String email;

    @ManyToMany
    private List<Address> addresses;

    public User(){
        this.id= UUID.randomUUID().toString();
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address=" + addresses +
                '}';
    }
}
