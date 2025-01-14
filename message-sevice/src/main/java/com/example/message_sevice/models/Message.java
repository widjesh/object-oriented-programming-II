package com.example.message_sevice.models;

import jakarta.persistence.*;


@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String message;
    private String direction;

    public Message(String message, String direction) {
        this.message = message;
        this.direction = direction;
    }

    public Message() {

    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String getDirection() {
        return direction;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
