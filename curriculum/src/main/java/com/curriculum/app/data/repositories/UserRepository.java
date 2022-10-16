package com.curriculum.app.data.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.curriculum.app.domain.entities.*;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
