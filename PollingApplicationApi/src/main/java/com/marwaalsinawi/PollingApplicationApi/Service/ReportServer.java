package com.marwaalsinawi.PollingApplicationApi.Service;

import com.marwaalsinawi.PollingApplicationApi.DTO.TotalNumberOfPolls;
import com.marwaalsinawi.PollingApplicationApi.Models.Choice;
import com.marwaalsinawi.PollingApplicationApi.Repository.ChoiceRepository;
import com.marwaalsinawi.PollingApplicationApi.Repository.OptionRepository;
import com.marwaalsinawi.PollingApplicationApi.Repository.PollRepository;
import com.marwaalsinawi.PollingApplicationApi.Repository.UserRepository;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class ReportServer {
    public static final String pathToReports = "C:\\Users\\user011\\Downloads\\reports";
    @Autowired
    PollRepository pollRepository;
    @Autowired
    OptionRepository optionRepository;
    @Autowired
    ChoiceRepository choiceRepository;
    @Autowired
    UserRepository userRepository;

    public String TotalOfPolls() throws FileNotFoundException, JRException {
        List<Choice> choiceList = choiceRepository.getAllChoice();
        List<TotalNumberOfPolls> totalNumberOfPolls = new ArrayList<>();
        for (Choice choice : choiceList) {
            Integer choiceId = choice.getId();
            String choiceName=choice.getChoice();
            TotalNumberOfPolls countOfPolls= new TotalNumberOfPolls(choiceName,choiceId);
            totalNumberOfPolls.add(countOfPolls);

        }

        File file = ResourceUtils.getFile("classpath:TotalNumberOfPolls.jrxml");//file object
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(totalNumberOfPolls);
        Map<String, Object> paramters = new HashMap<>();
        paramters.put("CreatedBy", "Marwa  ");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, paramters, dataSource);
        JasperExportManager.exportReportToPdfFile(jasperPrint, pathToReports + "\\TotalNumberOfPolls.pdf");

        return "Report generated : " + pathToReports + "\\TotalNumberOfPolls.pdf";
    }
}
