package kea.exercise.deliverybackendexamprep.Delivery;

import jakarta.persistence.*;
import kea.exercise.deliverybackendexamprep.ProductOrder.ProductOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate deliveryDate;
    private String fromWarehouse;
    private String destination;
    @OneToMany
    private List<ProductOrder> productOrders;

    public Delivery(LocalDate deliveryDate, String fromWarehouse, String destination, List<ProductOrder> productOrders) {
        this.deliveryDate = deliveryDate;
        this.fromWarehouse = fromWarehouse;
        this.destination = destination;
        this.productOrders = productOrders;
    }
}
