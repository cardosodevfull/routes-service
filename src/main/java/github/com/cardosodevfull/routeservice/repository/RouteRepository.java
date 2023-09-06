package github.com.cardosodevfull.routeservice.repository;

import github.com.cardosodevfull.routeservice.entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, String> {
}
