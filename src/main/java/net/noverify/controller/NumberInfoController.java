package net.noverify.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.noverify.model.UserEvents;
import net.noverify.service.UserEventService;
	
/** author:mahmoud ibrahim [cs.mahmoued@gmail.com]
 * this class for handle request url mapping as RestFullApis */
@RestController

/** cross origin connect with third party [angular 10]*/
@CrossOrigin
public class NumberInfoController {

	/** inject [NumberInfoService] bean by constructor injection */
	private UserEventService infoService;

	public NumberInfoController(UserEventService infoService) {
		this.infoService = infoService;
	}
	
	//http://apilayer.net/api/validate?access_key=1d0f126b5ab9c12446129459126a0fab&number=14158586273&country_code=&format=1
	
	@GetMapping("/all-events")
	public ResponseEntity<List<UserEvents>> allUserEvents(){
		
		return new ResponseEntity<>(infoService.getAllUserEvents(),HttpStatus.OK);
	}
	
	@PostMapping("/save-event")
	public ResponseEntity<Void> saveNewEvents(@RequestBody UserEvents event){
		this.infoService.saveEvents(event);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	
}
