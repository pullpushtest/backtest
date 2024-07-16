package com.gae.service;

import org.springframework.stereotype.Service;

import com.gae.mapper.ChatMapper;

@Service
public class ChatService {
	private ChatMapper mapper;

	public ChatService(ChatMapper mapper) {
		this.mapper = mapper;
	}
	
	
}
