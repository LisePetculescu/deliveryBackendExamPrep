package kea.exercise.deliverybackendexamprep.Product;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // find product by name
    Optional<Product> findByName(String name);

}
