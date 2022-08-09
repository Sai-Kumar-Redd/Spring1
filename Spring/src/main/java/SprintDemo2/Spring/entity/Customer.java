package SprintDemo2.Spring.entity;


import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;




import SprintDemo2.Spring.dto.CustomerType;
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer customerId;
    private String firstName;
    private String lastName;
    private String collegeName;
    private String email;



    private LocalDate dateOfBirth;
    public String getCollegeName() {

        return collegeName;
    }

    public void setCollegeName(String collegeName) {

        this.collegeName = collegeName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {

        this.dateOfBirth = dateOfBirth;
    }



    @Enumerated(EnumType.STRING)
    private CustomerType customerType;
    public Customer(Integer customerId) {

        this.customerId = customerId;
    }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="address_address_id",unique = true)
    private  Address address;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(unique=false)
    private List<Product> product;

    public Customer() {

    }


    public List<Product> getProduct() {

        return product;
    }

    public void setProduct(List<Product> product) {

        this.product = product;
    }

    public Address getAddress() {

        return address;
    }

    public void setAddress(Address address) {

        this.address = address;
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

    public CustomerType getCustomerType() {

        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {

        this.customerType = customerType;
    }

    @Override
    public int hashCode() {

        return Objects.hash(customerType, email, firstName, lastName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        return customerType == other.customerType && Objects.equals(email, other.email)
                && Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
    }

    @Override
    public String toString() {
        return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", customerType="
                + customerType + "]";
    }

    public Integer getCustomerId() {

        return customerId;
    }

    public void setCustomerId(Integer customerId ) {

        this.customerId=customerId;
    }


}

