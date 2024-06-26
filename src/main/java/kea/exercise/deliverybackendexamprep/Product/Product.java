package kea.exercise.deliverybackendexamprep.Product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private double weightInGrams;


    public Product(String name, double price, double weightInGrams) {
        this.name = name;
        this.price = price;
        this.weightInGrams = weightInGrams;
    }
}
