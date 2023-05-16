package com.marwaalsinawi.PollingApplicationApi.Repository;


import com.marwaalsinawi.PollingApplicationApi.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
}
