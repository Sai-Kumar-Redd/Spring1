package SprintDemo2.Spring.dto;

import javax.validation.constraints.NotBlank;

public class AddressDTO {



    @NotBlank(message="Street is invalid")
    private String street;

    @NotBlank(message="City is invalid")
    private String city;


    public String getStreet() {

        return street;
    }

    public void setStreet(String street) {

        this.street = street;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }
}

