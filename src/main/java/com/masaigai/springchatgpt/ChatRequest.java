package com.masaigai.springchatgpt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatRequest {

    private String model;
    private List<Message> messages;
    private int n;
    private double temperature;

    public ChatRequest(String model,String prompt,Integer n) {
        this.model = model;
        this.n = n;
        this.messages = new ArrayList<>();

        this.messages.add(new Message("user",prompt));
    }
}
