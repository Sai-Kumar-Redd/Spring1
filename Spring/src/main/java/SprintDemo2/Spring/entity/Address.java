package SprintDemo2.Spring.entity;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="address")
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String street;
    private String city;

    public Address() {
    }

    public Address(Integer addressId, String street, String city) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return addressId.equals(address.addressId) && street.equals(address.street) && city.equals(address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId, street, city);
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}


