package com.helpdesk.userserviceapi.repositories;

import com.helpdesk.userserviceapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
