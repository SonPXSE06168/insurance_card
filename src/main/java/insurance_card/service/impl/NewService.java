package insurance_card.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import insurance_card.model.dto.demoDTO;
import insurance_card.model.entity.nameEntity;
import insurance_card.model.vm.Convert;
import insurance_card.repository.NewRepository;
import insurance_card.service.INewServices;

@Service
public class NewService implements INewServices{
	
	@Autowired
	private NewRepository newRepository;
	
	@Autowired
	private Convert Convert;

	@Override
	public demoDTO save(demoDTO demoDTO) {
		//nameEntity nEntity = newRepository.findByName(demoDTO.getName());
		nameEntity nameEntity = Convert.toEntity(demoDTO);
		nameEntity = newRepository.save(nameEntity);
		return Convert.toDTO(nameEntity);
	}
	
	

}
