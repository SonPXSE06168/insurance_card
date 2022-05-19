package insurance_card.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import insurance_card.model.entity.AccountEntity;
import insurance_card.repository.AccountRepository;
import insurance_card.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public Optional<AccountEntity> findByUserName(String username) {
		return accountRepository.findByUserName(username);
	}

}
