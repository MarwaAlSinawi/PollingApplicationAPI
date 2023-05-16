package com.marwaalsinawi.PollingApplicationApi.Service;

import com.marwaalsinawi.PollingApplicationApi.Models.Option;
import com.marwaalsinawi.PollingApplicationApi.Models.Poll;
import com.marwaalsinawi.PollingApplicationApi.Repository.OptionRepository;
import com.marwaalsinawi.PollingApplicationApi.Repository.PollRepository;
import com.marwaalsinawi.PollingApplicationApi.RequestObject.NewOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OptionService {
    @Autowired
    PollRepository pollRepository;
    @Autowired
    OptionRepository optionRepository;
    public void createOption(NewOption optionInfo) {
        Option option=new Option();
        option.setValue(optionInfo.getValue());
        Long id=pollRepository.getIdByQuestion(optionInfo.getQuestion());
        Poll poll =pollRepository.findById(id).get();
        option.setPoll(poll);
        optionRepository.save(option);

    }
}
