package com.marwaalsinawi.PollingApplicationApi.Repository;

import com.marwaalsinawi.PollingApplicationApi.Models.EmailDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface MailingRepository {
    String sendSimpleMail(EmailDetails emailDetails);
}
