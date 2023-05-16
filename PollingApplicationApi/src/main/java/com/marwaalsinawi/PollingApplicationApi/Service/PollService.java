package com.marwaalsinawi.PollingApplicationApi.Service;

import com.marwaalsinawi.PollingApplicationApi.Models.Poll;

import com.marwaalsinawi.PollingApplicationApi.Repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service

public class PollService {
    @Autowired
    PollRepository pollRepository;

    public void createPoll(String question) {
        Poll poll = new Poll();
        poll.setQuestion(question);
        poll.setActive(Boolean.TRUE);
        poll.setCreatedDate(new Date());
        poll.setUpdatedDate(new Date());
        pollRepository.save(poll);

    }

    public List<Poll> getAllPoll() {
        return pollRepository.getAllPoll();
    }

    public void updatePollInformation(String question,  Boolean isActive, Integer PollId) {
        Poll poll = pollRepository.getPollById(PollId);
        poll.setQuestion(question);
        poll.setIsActive(isActive);
        pollRepository.save(poll);

    }
    public void deletePollById(Integer PoolId) {
        Poll poll = pollRepository.getPollById(PoolId);
        poll.setIsActive(false);
        pollRepository.save(poll);

    }
}
