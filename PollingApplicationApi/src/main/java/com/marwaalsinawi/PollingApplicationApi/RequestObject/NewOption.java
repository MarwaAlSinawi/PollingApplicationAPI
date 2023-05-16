package com.marwaalsinawi.PollingApplicationApi.RequestObject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Data
@Setter
@Getter
public class NewOption {

    private String value;

    private String question;
}
