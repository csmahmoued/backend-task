package net.noverify.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.noverify.model.UserEvents;
import net.noverify.repository.UserEventRepository;

@Service
public class UserEventService {

	private UserEventRepository eventRepository;
	public UserEventService(UserEventRepository eventRepository) {
		this.eventRepository = eventRepository;
	}
	
	public List<UserEvents> getAllUserEvents(){
		return this.eventRepository.findAll();
	}
	
	public void saveEvents(UserEvents event) {
		 this.eventRepository.save(event); 
	}
}
