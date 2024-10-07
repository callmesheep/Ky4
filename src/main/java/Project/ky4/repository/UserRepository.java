/*
 * (C) Copyright 2022. All Rights Reserved.
 *
 * @author DongTHD
 * @date Mar 10, 2022
*/
package Project.ky4.repository;

import Project.ky4.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findByStatusTrue();

	Boolean existsByEmail(String email);

	Optional<User> findByEmail(String username);

	User findByToken(String token);

}
