package Project.ky4.entity;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.stream.Location;
import java.io.Serializable;
import java.security.Provider;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tours")
public class Tours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tourId;
    private String name;
    private String description;
    private Double price;
    private int discount;
    private LocalDate Duration;
    private LocalDate enteredDate;
    private LocalDate StartDate;
    private LocalDate EndDate;
    private Boolean status;
    private int sold;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "providerId")
    private Providers provider;

    @OneToOne
    @JoinColumn(name = "location")
    private Locations location;

    @Override
    public String toString() {
        return "Tours{" +
                "tourId=" + tourId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", Duration=" + Duration +
                ", enteredDate=" + enteredDate +
                ", StartDate=" + StartDate +
                ", EndDate=" + EndDate +
                ", status=" + status +
                ", sold=" + sold +
                ", category=" + category +
                ", provider=" + provider +
                ", location=" + location +
                '}';
    }
}
