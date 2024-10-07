package Project.ky4.repository;

import Project.ky4.entity.Category;
import Project.ky4.entity.Providers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProviderReposotory extends JpaRepository<Providers, Long> {
    List<Providers> findByStatusTrue();

    List<Providers> findByStatusTrueOrderBySoldDesc() ;//findByStatusTrueOrderBySoldDesc()

    List<Providers> findTop10ByOrderBySoldDesc();

    List<Providers> findByStatusTrueOrderByQuantityDesc();

    List<Providers> findByStatusTrueOrderByEnteredDateDesc();

    List<Providers> findByCategory(Category category);
}
