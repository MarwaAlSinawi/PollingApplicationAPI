package com.marwaalsinawi.PollingApplicationApi.Controller;


import com.marwaalsinawi.PollingApplicationApi.Models.Option;
import com.marwaalsinawi.PollingApplicationApi.RequestObject.NewOption;
import com.marwaalsinawi.PollingApplicationApi.Service.OptionService;

import com.marwaalsinawi.PollingApplicationApi.Service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "option")
public class OptionController {
    @Autowired
    OptionService optionService;
   @Autowired
   PollService pollService;
    @RequestMapping(value = "/createOption", method = RequestMethod.POST)
    public String createOption(@RequestBody NewOption optionInfo) {
        optionService.createOption(optionInfo);
        return "option Created Successfuly";
    }
}
