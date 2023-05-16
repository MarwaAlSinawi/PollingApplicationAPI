package com.marwaalsinawi.PollingApplicationApi.Repository;

import com.marwaalsinawi.PollingApplicationApi.Models.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionRepository extends JpaRepository<Option, Long> {


}
