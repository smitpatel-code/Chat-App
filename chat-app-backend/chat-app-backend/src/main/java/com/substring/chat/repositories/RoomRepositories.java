package com.substring.chat.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.substring.chat.entities.Room;

public interface RoomRepositories extends MongoRepository<Room, String>{
	
	  Room findByRoomId(String roomId);
	

}
