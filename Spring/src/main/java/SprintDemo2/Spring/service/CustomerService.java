package SprintDemo2.Spring.service;


import java.util.List;

        import SprintDemo2.Spring.dto.CustomerDTO;
        import SprintDemo2.Spring.entity.Customer;

public interface CustomerService {

    public void createCustomerRecord(CustomerDTO customerDTO);
    public List<Customer> fetechAllCustomers();
    public void deleteACustomer(Integer customerId);
    public CustomerDTO fetechcustomerById(Integer customerId);
    public void updateById(Integer customerId, CustomerDTO customerDTO);

    void deleteAProduct(Integer productId, Integer customerId);
}

