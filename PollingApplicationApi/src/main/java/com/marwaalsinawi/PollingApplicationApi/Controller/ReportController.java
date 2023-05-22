package com.marwaalsinawi.PollingApplicationApi.Controller;

import com.marwaalsinawi.PollingApplicationApi.Service.ReportServer;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileNotFoundException;

public class ReportController {
    @Autowired
    ReportServer reportServer;


    @RequestMapping(value="TotalOfPoll")
    public String TotalOfPolls() throws JRException, FileNotFoundException {
        return reportServer.TotalOfPolls();
    }
}
