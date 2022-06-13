package insurance_card.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import insurance_card.model.entity.UserEntity;
import insurance_card.model.vm.UserVM;
import insurance_card.service.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/get-list-user-by-name")
	public ResponseEntity<List<UserEntity>> getListUserName(@RequestBody UserVM username) {
		return ResponseEntity.ok().body(userService.findOneByUserName(username));
	}

	@GetMapping(value = "/get-list-user")
	public ResponseEntity<List<UserEntity>> getListUser() {
		return ResponseEntity.ok().body(userService.getListUser());
	}

}
