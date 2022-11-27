package com.godoro.OF011.inheritance;

import com.godoro.OF011.person.Person;

public class Agent extends Person {

    private int agentId;

    private String activityRegion;


    public Agent() {
    }

    public Agent(int agentId, String activityRegion) {
        this.agentId = agentId;
        this.activityRegion = activityRegion;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public String getActivityRegion() {
        return activityRegion;
    }

    public void setActivityRegion(String activityRegion) {
        this.activityRegion = activityRegion;
    }

    @Override //Abstract class from super Class!
    public String getGreetings() {
        return "Selam Agent!";
    }
}
