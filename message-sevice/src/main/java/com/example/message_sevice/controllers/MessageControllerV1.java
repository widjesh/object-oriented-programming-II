package com.example.message_sevice.controllers;

import com.example.message_sevice.models.Message;
import com.example.message_sevice.services.IMessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/v1/messages")
public class MessageControllerV1 {

    private IMessageService messageService;

    public MessageControllerV1(IMessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Message>> getMessages(){
        List<Message> messages = messageService.getAllMessages();
        return ResponseEntity.ok(messages);
    }

    @PostMapping("/send")
    public ResponseEntity<Message> getMessages(@RequestBody Message incomingMessage){
        Message savedSendMessage = messageService.sendMessage(incomingMessage);
        return ResponseEntity.ok(savedSendMessage);
    }

}
