package com.webappdemo.model;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stateid")
    private  int state_id;

    @Column(name = "statename")
    private String state_name;


    public State() {
    }

    public State(int state_id, String state_name) {
        this.state_id = state_id;
        this.state_name = state_name;
    }

    public int getState_id() {
        return state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }



    @Override
    public String toString() {
        return "State{" +
                "state_id=" + state_id +
                ", state_name='" + state_name + '\'' +
                '}';
    }
}
