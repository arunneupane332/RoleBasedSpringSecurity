package com.example.JWT_Role_Based.Repository;

import com.example.JWT_Role_Based.Models.ERole;
import com.example.JWT_Role_Based.Models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
