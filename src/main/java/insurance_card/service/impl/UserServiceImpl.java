package insurance_card.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import insurance_card.model.entity.UserEntity;
import insurance_card.model.vm.UserVM;
import insurance_card.repository.UserRepository;
import insurance_card.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserEntity> getListUser() {
		return userRepository.findAll();
	}

	@Override
	public List<UserEntity> findOneByUserName(UserVM username) {
		return userRepository.findOneByUsername(username.getUsername());
	}

}
