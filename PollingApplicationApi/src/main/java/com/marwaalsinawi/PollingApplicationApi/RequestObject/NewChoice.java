package com.marwaalsinawi.PollingApplicationApi.RequestObject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class NewChoice {
    String choice;

    private String question;
}
