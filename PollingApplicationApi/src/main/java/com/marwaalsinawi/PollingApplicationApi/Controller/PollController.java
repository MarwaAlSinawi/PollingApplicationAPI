package com.marwaalsinawi.PollingApplicationApi.Controller;

import com.marwaalsinawi.PollingApplicationApi.Models.Poll;
import com.marwaalsinawi.PollingApplicationApi.Repository.PollRepository;
import com.marwaalsinawi.PollingApplicationApi.Service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Poll")
public class PollController {
    @Autowired

    PollService pollService;

    @RequestMapping(value = "/createPoll", method = RequestMethod.POST)
    public String createPoll(@RequestParam String question) {
        pollService.createPoll(question);
        return "poll Created Successfuly";
    }
    @RequestMapping(value = "/getAllPoll", method = RequestMethod.GET)
    //function that returns all Poll
    public List<Poll> getAllPoll() {
        List<Poll> Poll = pollService.getAllPoll();
        return Poll;
    }
    @RequestMapping(value = "updatePoll",method = RequestMethod.POST)
    public void updatePoll(@RequestParam String question,  Boolean isActive, Integer PollId){
        pollService.updatePollInformation(question,isActive,PollId);
    }
    @RequestMapping(value = "deletePollById", method = RequestMethod.POST)
    public void deletePollById(@RequestParam Integer PoolId) {
        pollService.deletePollById(PoolId);

    }
}