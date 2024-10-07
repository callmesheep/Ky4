package Project.ky4.repository;

import Project.ky4.entity.Reviews;
import Project.ky4.entity.Tours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Long> {

    List<Reviews> findAllByOrderByIdDesc();


    List<Reviews> findByToursOrderByIdDesc(Tours tours);
}
