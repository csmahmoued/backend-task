package net.noverify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.noverify.model.UserEvents;

@Repository
public interface UserEventRepository extends JpaRepository<UserEvents, Integer> {

}
