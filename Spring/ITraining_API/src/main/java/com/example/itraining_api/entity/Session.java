package com.example.itraining_api.entity;


import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Session")

public class Session {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    public int id;

  @ManyToOne
    @JoinColumn(name="sessionTeacher")
    public TeacherAccount teacher;

    public int nbSession;
    
    public Date startDate;

    public Date endDate;

    public String room;

    public Boolean status;
   @ManyToOne
    @JoinColumn(name="training_id")
    public Training trainingSession;





    public int getNbSession() {
        return nbSession;
    }

    public void setNb_session(int nbSession) {
        this.nbSession = nbSession;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Date getStartDate() {
        return startDate;
    }

    public void setStart_date(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public TeacherAccount getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherAccount teacher) {
        this.teacher = teacher;
    }

    public Training getTrainingSession() {
        return trainingSession;
    }

    public void setTrainingSession(Training trainingSession) {
        this.trainingSession = trainingSession;
    }

    public Session(TeacherAccount teacher, int nb_session, Date startDate, Date endDate, String room, Boolean status, Training trainingSession) {
        this.teacher = teacher;
        this.nbSession = nbSession;
        this.startDate = startDate;
        this.endDate = endDate;
        this.room = room;
        this.status = status;
        this.trainingSession = trainingSession;
    }

    public Session() {
    }
}

