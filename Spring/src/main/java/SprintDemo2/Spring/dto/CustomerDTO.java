package SprintDemo2.Spring.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
//import  javax.validation.constraints.

public class CustomerDTO {

    private Integer customerId;

    @NotBlank(message="First name Cant be Blank")
    private String firstName;

    @NotBlank(message="Last name Cant be Blank")
    private String lastName;

    @NotBlank(message="Email name Cant be Blank")
    private String email;


    @NotNull(message="college name Cant be Blank")
    private String collegeName;



    @NotNull(message="DOB cannot be empty")
    @Past(message="DOB cannot be in future")

     private  LocalDate dateOfBirth;

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



    private CustomerType customerType;

    @Valid
    private AddressDTO addressDTO;

    @Valid
    private List<ProductDTO> productDTO;

    public List<ProductDTO> getProductDTO() {

        return productDTO;
    }

    public void setProductDTO(List<ProductDTO> productDTO) {

        this.productDTO = productDTO;
    }

    public AddressDTO getAddressDTO() {

        return addressDTO;
    }

    public void setAddressDTO(AddressDTO addressDTO) {

        this.addressDTO = addressDTO;
    }
;




    public Integer getCustomerId() {

        return customerId;
    }
    public void setCustomerId(Integer customerId) {

        this.customerId = customerId;
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
        return Objects.hash(customerId, customerType, email, firstName, lastName);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CustomerDTO other = (CustomerDTO) obj;
        return Objects.equals(customerId, other.customerId) && customerType == other.customerType
                && Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
                && Objects.equals(lastName, other.lastName);
    }
    @Override
    public String toString() {
        return "CustomerDTO [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
                + ", email=" + email + ", customerType=" + customerType + "]";
    }



}

