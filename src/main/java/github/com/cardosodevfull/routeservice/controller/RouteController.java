package github.com.cardosodevfull.routeservice.controller;

import github.com.cardosodevfull.routeservice.entity.Delivery;
import github.com.cardosodevfull.routeservice.entity.Route;
import github.com.cardosodevfull.routeservice.enuns.StatusEnum;
import github.com.cardosodevfull.routeservice.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@RequestMapping("/api/route")
public class RouteController {

    @Autowired
    private RouteService routeService;

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody Route route) {
        var delivery = new Delivery();

        route.setCreatedAt(LocalDateTime.now(ZoneId.of("UTC")));
        route.setStatus(StatusEnum.CREATED);
        route.setUserCurrier("notification");

        for(int i = 0;i< route.getDeliveries().size(); i++) {
            route.getDeliveries().get(i).setStatus(StatusEnum.CREATED);
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(routeService.save(route));
    }

    @GetMapping
    public ResponseEntity<Object> getAllRoutes() {
        return routeService.getAll();
    }
}
