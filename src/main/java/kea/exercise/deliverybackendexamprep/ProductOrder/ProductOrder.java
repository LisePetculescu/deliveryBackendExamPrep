package kea.exercise.deliverybackendexamprep.ProductOrder;


import kea.exercise.deliverybackendexamprep.Product.Product;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ProductOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Product product;
    private int quantity;

    public ProductOrder(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
