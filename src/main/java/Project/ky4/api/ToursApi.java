package Project.ky4.api;


import Project.ky4.entity.Category;
import Project.ky4.entity.Tours;
import Project.ky4.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/products")
public class ToursApi {
    @Autowired
    TourRepository repo;

    @Autowired
    CategoryRepository cRepo;

    @Autowired
    LocationRepository LRepo;

    @GetMapping
    public ResponseEntity<List<Tours>> getAll() {
        return ResponseEntity.ok(repo.findByStatusTrue()); // ResponseEntity.ok(repo.findByStatusTrue());
    }

    @GetMapping("bestseller")
    public ResponseEntity<List<Tours>> getBestSeller() {
        return ResponseEntity.ok(repo.findByStatusTrueOrderBySoldDesc());//findByStatusTrueOrderBySoldDesc()
    }
    @GetMapping("category/{id}")
    public ResponseEntity<List<Tours>> getByCategory(@PathVariable("id") Long id) {
        if (!cRepo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        Category c = cRepo.findById(id).get();
        return ResponseEntity.ok(repo.findByCategory(c));
    }
    @GetMapping("latest")
    public ResponseEntity<List<Tours>> getLasted() {
        return ResponseEntity.ok(repo.findByStatusTrueOrderByEnteredDateDesc());
    }
    @GetMapping("{id}")
    public ResponseEntity<Tours> getById(@PathVariable("id") Long id) {

        if (!repo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(repo.findById(id).get());
    }
    @GetMapping("rated")
    public ResponseEntity<List<Tours>> getRated() {
        return ResponseEntity.ok(repo.findProductRated());
    }

    @PostMapping
    public ResponseEntity<Tours> post(@RequestBody Tours tour) {
        if (repo.existsById(tour.getTourId())) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(repo.save(tour));
    }
    @PutMapping("{id}")
    public ResponseEntity<Tours> put(@PathVariable("id") Long id, @RequestBody Tours tour) {
        if (!id.equals(tour.getTourId())) {
            return ResponseEntity.badRequest().build();
        }
        if (!repo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(repo.save(tour));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        if (!repo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        Tours p = repo.findById(id).get();
        p.setStatus(false);
        repo.save(p);
        return ResponseEntity.ok().build();
    }

}
