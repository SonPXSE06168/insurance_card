package insurance_card.model.vm;

import org.springframework.stereotype.Component;

import insurance_card.model.dto.demoDTO;
import insurance_card.model.entity.nameEntity;

@Component
public class Convert {
	public nameEntity toEntity(demoDTO dto) {
		nameEntity entity = new nameEntity();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setComment(dto.getComment());
		return entity;
	}
	
	public demoDTO toDTO(nameEntity entity) {
		demoDTO dto = new demoDTO();
		dto.setName(entity.getName());
		dto.setAge(entity.getAge());
		dto.setComment(entity.getComment());
		return dto;
	}

}
