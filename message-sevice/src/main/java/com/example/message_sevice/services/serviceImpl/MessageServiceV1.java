package com.example.message_sevice.services.serviceImpl;

import com.example.message_sevice.models.Message;
import com.example.message_sevice.repository.MessageRepository;
import com.example.message_sevice.services.IMessageService;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MessageServiceV1 implements IMessageService {

    private final MessageRepository messageRepository;

    public MessageServiceV1(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    @Override
    public Message sendMessage(Message outgoingMessage){
        try{
            return messageRepository.save(outgoingMessage);
        }catch(Exception exception){
            System.out.println("Failed to send message");
        }
        return null;
    }
}
