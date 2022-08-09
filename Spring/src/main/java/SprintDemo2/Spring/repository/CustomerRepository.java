package SprintDemo2.Spring.repository;


import org.springframework.data.jpa.repository.JpaRepository;

        import SprintDemo2.Spring.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{



}

