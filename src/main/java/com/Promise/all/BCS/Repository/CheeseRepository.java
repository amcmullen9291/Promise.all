package com.Promise.all.BCS.Repository;

import com.Promise.all.BCS.Entity.Cheese;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheeseRepository extends JpaRepository<Cheese, Long> {
}
