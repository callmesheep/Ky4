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
@Table(name = "categories")
public class Images implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long imageId;
    private String imageData;
    private String caption;
    private String imageType;

    @ManyToOne
    @JoinColumn(name = "tourId")
    private Tours tour;

    @ManyToOne
    @JoinColumn(name = "providerId")
    private Providers provider;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

}
