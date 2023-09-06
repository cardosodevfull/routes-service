package github.com.cardosodevfull.routeservice.repository;

import github.com.cardosodevfull.routeservice.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, String> {
}
