package com.marwaalsinawi.PollingApplicationApi.Controller;

import com.marwaalsinawi.PollingApplicationApi.RequestObject.NewChoice;
import com.marwaalsinawi.PollingApplicationApi.RequestObject.NewOption;
import com.marwaalsinawi.PollingApplicationApi.Service.ChoiceService;
import com.marwaalsinawi.PollingApplicationApi.Service.OptionService;
import com.marwaalsinawi.PollingApplicationApi.Service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "choice")
public class ChoiceController {

    @Autowired
    ChoiceService choiceService;

    @Autowired
    PollService pollService;
    @RequestMapping(value = "/createChoice", method = RequestMethod.POST)
    public String createChoice(@RequestBody NewChoice choiceInfo) {
        choiceService.createChoice(choiceInfo);

        return "choice Created Successfuly";
    }
}
