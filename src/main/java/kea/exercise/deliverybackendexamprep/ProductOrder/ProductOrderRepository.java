package kea.exercise.deliverybackendexamprep.ProductOrder;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Long> {
    Optional<ProductOrder> findProductOrderById(Long id);
}
