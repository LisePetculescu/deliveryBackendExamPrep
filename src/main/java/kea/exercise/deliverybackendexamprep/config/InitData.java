package kea.exercise.deliverybackendexamprep.config;

import kea.exercise.deliverybackendexamprep.Delivery.Delivery;
import kea.exercise.deliverybackendexamprep.Delivery.DeliveryRepository;
import kea.exercise.deliverybackendexamprep.Product.Product;
import kea.exercise.deliverybackendexamprep.Product.ProductRepository;
import kea.exercise.deliverybackendexamprep.ProductOrder.ProductOrder;
import kea.exercise.deliverybackendexamprep.ProductOrder.ProductOrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class InitData implements CommandLineRunner {

    private final ProductRepository productRepository;

    private final ProductOrderRepository productOrderRepository;

    private final DeliveryRepository deliveryRepository;

    public InitData(ProductRepository productRepository, ProductOrderRepository productOrderRepository, DeliveryRepository deliveryRepository) {
        this.productRepository = productRepository;
        this.productOrderRepository = productOrderRepository;
        this.deliveryRepository = deliveryRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("InitData.run");


        setupData();



    }

    private void setupData() {

        List<Product> products = new ArrayList<>();
        // TODO: add products to the database here
        products.add(new Product("Apple", 2.5, 50));
        products.add(new Product("Banana", 1.5, 100));
        products.add(new Product("Orange", 3.5, 30));
        products.add(new Product("Pineapple", 5.5, 20));
        products.add(new Product("Mango", 4.5, 40));
        products.add(new Product("Kiwi", 8, 60));
        products.add(new Product("Strawberry", 6, 70));

        productRepository.saveAll(products);

        List<ProductOrder> productOrders = new ArrayList<>();
        // TODO: add product orders to the database here
        productOrders.add(new ProductOrder(products.get(0), 10));
        productOrders.add(new ProductOrder(products.get(1), 20));
        productOrders.add(new ProductOrder(products.get(2), 30));
        productOrders.add(new ProductOrder(products.get(3), 40));
        productOrders.add(new ProductOrder(products.get(4), 50));
        productOrders.add(new ProductOrder(products.get(5), 60));
        productOrders.add(new ProductOrder(products.get(6), 70));

        productOrderRepository.saveAll(productOrders);

        List<Delivery> deliveries = new ArrayList<>();
        // TODO: add deliveries to the database here
        deliveries.add(new Delivery(LocalDate.of(2021,12,5), "Warehouse 1", "Copenhagen", productOrders.subList(0, 3)));
        deliveries.add(new Delivery(LocalDate.of(2021, 12, 2), "Warehouse 2", "Aarhus", productOrders.subList(3, 6)));
        deliveries.add(new Delivery(LocalDate.of(2021, 12, 3), "Warehouse 3", "Odense", productOrders.subList(6, 7)));



    }



}
