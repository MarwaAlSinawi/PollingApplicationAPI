package com.marwaalsinawi.PollingApplicationApi.Models;

import lombok.Data;
import lombok.Getter;
import org.apache.catalina.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Entity
@Getter
@Data
@Table(name = "polls")
public class Poll  extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String question;




   // @JoinColumn(  name = "user_id" , referencedColumnName = "id")
   // private User user;
}
