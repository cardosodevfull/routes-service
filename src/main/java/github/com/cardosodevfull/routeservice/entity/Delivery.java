package github.com.cardosodevfull.routeservice.entity;

import github.com.cardosodevfull.routeservice.enuns.StatusEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "deliveries")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(nullable = false)
    private String andress;
    @Column(nullable = false)
    private String complement;
    @Column(nullable = false)
    private String instruction;
    @Column(nullable = true)
    @Enumerated(EnumType.STRING)
    private StatusEnum status;
    @Column(nullable = false)
    private Double latitude;
    @Column(nullable = false)
    private Double longitude;

    public Delivery() {
    }

    public Delivery(String id, String andress, String complement, String instruction, StatusEnum status, Double latitude, Double longitude) {
        this.id = id;
        this.andress = andress;
        this.complement = complement;
        this.instruction = instruction;
        this.status = status;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAndress() {
        return andress;
    }

    public void setAndress(String andress) {
        this.andress = andress;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
