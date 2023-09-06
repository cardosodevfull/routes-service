package github.com.cardosodevfull.routeservice.service;

import github.com.cardosodevfull.routeservice.entity.Route;
import github.com.cardosodevfull.routeservice.repository.RouteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    @Transactional
    public Object save(Route route) {
        return routeRepository.save(route);
    }
}
