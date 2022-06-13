package insurance_card.service;

import java.util.List;

import insurance_card.model.entity.UserEntity;
import insurance_card.model.vm.UserVM;

public interface UserService {

	public List<UserEntity> getListUser();

	public List<UserEntity> findOneByUserName(UserVM username);
}
