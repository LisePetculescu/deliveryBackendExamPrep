package kea.exercise.deliverybackendexamprep.Delivery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}
