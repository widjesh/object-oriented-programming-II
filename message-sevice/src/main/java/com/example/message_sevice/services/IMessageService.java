package com.example.message_sevice.services;

import com.example.message_sevice.models.Message;

import java.util.List;

public interface IMessageService {
    List<Message> getAllMessages();

    Message sendMessage(Message incomingMessage);
}
