package com.challenge6;

/**
 * Created by This1 on 03/09/2015.
 */
public class EventClass {
    private final double costPerGuest = 40.0;
    private String eventType;
    private String dateOfEvent;
    private int noOfGuests;

    public EventClass(String eventType) {
        this.eventType = eventType;
    }

    public EventClass(String eventType, String dateOfEvent, int noOfGuests) {
        this.eventType = eventType;
        this.dateOfEvent = dateOfEvent;
        this.noOfGuests = noOfGuests;
    }

    public EventClass(String eventType, String dateOfEvent) {

        this.eventType = eventType;
        this.dateOfEvent = dateOfEvent;
    }

    EventClass() {
    }

    public double getCostPerGuest() {
        return costPerGuest;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getDateOfEvent() {
        return dateOfEvent;
    }

    public void setDateOfEvent(String dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }

    public int getNoOfGuests() {
        return noOfGuests;
    }

    public void setNoOfGuests(int noOfGuests) {
        this.noOfGuests = noOfGuests;
    }

}
