package kea.exercise.deliverybackendexamprep.Delivery;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController {

    private DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @GetMapping
    public List<Delivery> getDeliveries() {
        return deliveryService.getDeliveries();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Delivery> getDeliveryById(@PathVariable Long id) {
        return ResponseEntity.of(deliveryService.getDeliveryById(id));
    }

    @PostMapping
    public Delivery createDelivery(@RequestBody Delivery delivery) {
        return deliveryService.createDelivery(delivery);
    }

    // make a route for adding productOrders by id to a delivery by id
   @PutMapping("/{deliveryId}/addProductOrder/{productOrderId}")
    public ResponseEntity<Delivery> addProductOrderToDelivery(@PathVariable Long deliveryId, @PathVariable Long productOrderId) {
        return ResponseEntity.of(deliveryService.addProductOrderToDelivery(deliveryId, productOrderId));
    }




}
