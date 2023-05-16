package com.marwaalsinawi.PollingApplicationApi.Repository;

import com.marwaalsinawi.PollingApplicationApi.Models.Choice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChoiceRepository extends JpaRepository<Choice, Integer> {
}
