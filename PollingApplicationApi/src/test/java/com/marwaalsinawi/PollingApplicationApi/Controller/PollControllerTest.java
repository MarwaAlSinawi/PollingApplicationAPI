package com.marwaalsinawi.PollingApplicationApi.Controller;

import com.marwaalsinawi.PollingApplicationApi.Models.Poll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PollControllerTest {
@Autowired
PollController pollController;

//Unit test for this method "looks in table if there is empty row"
    @Test
    void getAllPoll() {
        List<Poll> allPollTest=pollController.getAllPoll();
        assertNotNull(allPollTest);
    }



}