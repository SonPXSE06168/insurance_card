package insurance_card.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import insurance_card.model.entity.AccountEntity;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {

	public Optional<AccountEntity> findByUserName(@Param("username") String username);

}
