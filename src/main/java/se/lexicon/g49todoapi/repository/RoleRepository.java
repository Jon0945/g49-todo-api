package se.lexicon.g49todoapi.repository;

import org.springframework.stereotype.Repository;
import se.lexicon.g49todoapi.domain.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
