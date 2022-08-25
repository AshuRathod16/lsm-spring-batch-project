package com.bridgelabz.lmsspringbatchproject.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Candidates {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @Column(name = "cicId")
    private String cicId;
    @Column(name = "fullName")
    private String fullName;
    @Column(name = "email")
    private String email;
    @Column(name = "mobleNum")
    private String mobileNum;
    @Column(name = "hiredDate")
    private String hiredDate;
    @Column(name = "degree")
    private String degree;
    @Column(name = "aggrPer")
    private String aggrPer;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "preferredJobLocation")
    private String preferredJobLocation;
    @Column(name = "ststus")
    private String status;
    @Column(name = "passedOutYear")
    private String passedOutYear;
    @Column(name = "creatorUser")
    private String creatorUser;
    @Column(name = "candidateStatus")
    private String candidateStatus;

    public Candidates() {
    }
}
