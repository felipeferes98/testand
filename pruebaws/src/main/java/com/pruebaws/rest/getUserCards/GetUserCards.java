package com.pruebaws.rest.getUserCards;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaws.service.UserCard;

@RestController
public class GetUserCards {

	@Autowired
	@Qualifier("userCard")
	private UserCard	 userCard;
	
	@GetMapping(value="/getUserCards",produces=MediaType.APPLICATION_JSON_VALUE)
	public void getUserCards(@PathParam	("nombre") String email, @PathParam("nombre")String password){	
		userCard.getUserCards("");
		
	}

}