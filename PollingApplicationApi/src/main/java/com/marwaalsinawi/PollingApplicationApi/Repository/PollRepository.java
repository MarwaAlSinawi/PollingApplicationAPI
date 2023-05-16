package com.marwaalsinawi.PollingApplicationApi.Repository;

import com.marwaalsinawi.PollingApplicationApi.Models.Poll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PollRepository extends JpaRepository<Poll, Long> {

    @Query(value = "select id from polls WHERE question = :question", nativeQuery = true)
    Long getIdByQuestion(@Param("question") String question);

    @Query("SELECT p from Poll p")
    List<Poll> getAllPoll();

    @Query(value = "SELECT p FROM Poll p WHERE p.id =:PollId")
    Poll getPollById(@Param("PollId")long id);

}
