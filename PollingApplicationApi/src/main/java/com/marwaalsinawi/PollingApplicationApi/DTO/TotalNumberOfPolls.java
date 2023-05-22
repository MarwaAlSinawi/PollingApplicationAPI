package com.marwaalsinawi.PollingApplicationApi.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class TotalNumberOfPolls {
    String choice ;
    Integer poll_id;

    public TotalNumberOfPolls(String choice, Integer poll_id) {
        this.choice = choice;
        this.poll_id = poll_id;
    }
}
