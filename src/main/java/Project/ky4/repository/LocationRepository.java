package Project.ky4.repository;

import Project.ky4.entity.Locations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Locations, Long> {
}
