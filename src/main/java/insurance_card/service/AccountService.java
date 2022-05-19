package insurance_card.service;

import java.util.Optional;

import insurance_card.model.entity.AccountEntity;

public interface AccountService {

	public Optional<AccountEntity> findByUserName(String username);
}
