package github.com.cardosodevfull.routeservice.entity;

import github.com.cardosodevfull.routeservice.enuns.StatusEnum;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "routes")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "user_name", nullable = false)
    private String userName;
    @Column(name = "user_currier", nullable = false)
    private String userCurrier;
    @Column(nullable = false)
    private Double distance;
    @Column(nullable = false)
    private Double price;
    private LocalDateTime createdAt;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusEnum status;
    @OneToMany(targetEntity = Delivery.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "rota_id", referencedColumnName = "id")
    private List<Delivery> deliveries = new ArrayList<>();

    public Route() {
    }

    public Route(String id, String userName, String userCurrier, Double distance, Double price, LocalDateTime createdAt, StatusEnum status, List<Delivery> deliveries) {
        this.id = id;
        this.userName = userName;
        this.userCurrier = userCurrier;
        this.distance = distance;
        this.price = price;
        this.createdAt = createdAt;
        this.status = status;
        this.deliveries = deliveries;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCurrier() {
        return userCurrier;
    }

    public void setUserCurrier(String userCurrier) {
        this.userCurrier = userCurrier;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }
}
