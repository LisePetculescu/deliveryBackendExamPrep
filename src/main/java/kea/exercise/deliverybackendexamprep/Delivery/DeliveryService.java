package kea.exercise.deliverybackendexamprep.Delivery;

import kea.exercise.deliverybackendexamprep.ProductOrder.ProductOrder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeliveryService {

    private DeliveryRepository deliveryRepository;

    public DeliveryService(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    public List<Delivery> getDeliveries() {
        return deliveryRepository.findAll();
    }

    public Optional<Delivery> getDeliveryById(Long id) {
        return deliveryRepository.findById(id);

    }

    public Delivery createDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }


//    public Optional<Delivery> addProductOrderToDelivery(Long deliveryId, Long productOrderId) {
//        Optional<Delivery> delivery = deliveryRepository.findById(deliveryId);
//        Optional<ProductOrder> productOrder = productOrderRepository.findProductOrderById(productOrderId);
//
//
//        if (delivery.isPresent() && productOrder.isPresent()) {
//            delivery.get().getProductOrders().add(productOrder.get());
//            deliveryRepository.save(delivery.get());
//            return delivery;
//        } else {
//            return Optional.empty();
//        }
//    }
}
