package com.marwaalsinawi.PollingApplicationApi.Repository;

import com.marwaalsinawi.PollingApplicationApi.Models.Choice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChoiceRepository extends JpaRepository<Choice, Integer> {
    @Query("SELECT c from Choice c")
    List<Choice>getAllChoice();
}
