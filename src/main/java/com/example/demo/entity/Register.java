package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "infomation2")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Register {

    @Id
    private String id;
    private String fathername;
    private String fatherphonenumber;
    private String branch;
    private String fatherage;
    private String mothername;
    private String motherphonenumber;
    private String motherage;
    private String firstchildname;
    private String firstage;
    private String firstsex;
    private String secondchildname;
    private String secondage;
    private String secondsex;
    private String thirdchildname;
    private String thirdage;
    private String thirdsex;
    private String fourthchildname;
    private String forthage;
    private String forthsex;
    private String fifthchildname;
    private String fifthage;
    private String fifthsex;
    private String childleft;
    private String severity;

}
