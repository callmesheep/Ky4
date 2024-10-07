package Project.ky4.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "locations")

public class Locations implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long locationId;
    private String name;
    private String description;
    private String country;
    private String city;
    private Boolean status;



}
