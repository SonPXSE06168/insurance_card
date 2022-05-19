package insurance_card.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import insurance_card.model.entity.AccountEntity;
import insurance_card.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;

	@GetMapping(value = "/demo")
	public Optional<AccountEntity> getAccountByName(@RequestBody String username) {
		return accountService.findByUserName(username);
	}
}
