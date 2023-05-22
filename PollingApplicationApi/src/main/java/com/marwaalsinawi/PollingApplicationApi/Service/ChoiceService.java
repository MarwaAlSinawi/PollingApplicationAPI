package com.marwaalsinawi.PollingApplicationApi.Service;

import com.marwaalsinawi.PollingApplicationApi.Models.Choice;
import com.marwaalsinawi.PollingApplicationApi.Models.Option;
import com.marwaalsinawi.PollingApplicationApi.Models.Poll;
import com.marwaalsinawi.PollingApplicationApi.Repository.ChoiceRepository;
import com.marwaalsinawi.PollingApplicationApi.Repository.PollRepository;
import com.marwaalsinawi.PollingApplicationApi.RequestObject.NewChoice;
import com.marwaalsinawi.PollingApplicationApi.RequestObject.NewOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoiceService {
    @Autowired
    PollRepository pollRepository;

    @Autowired
    ChoiceRepository choiceRepository;

    public void createChoice(NewChoice choiceInfo) {
        Choice choice = new Choice();
        choice.setChoice(choiceInfo.getChoice());
        Long id = pollRepository.getIdByQuestion(choiceInfo.getQuestion());
        Poll poll = pollRepository.findById(id).get();
        choice.setPoll(poll);
        choiceRepository.save(choice);

    }
        public List<Choice> getAllChoice(){
            List<Choice>getAllChoice=choiceRepository.getAllChoice();
         return getAllChoice;



        }
    }
