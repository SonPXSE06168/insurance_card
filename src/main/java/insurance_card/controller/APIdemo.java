package insurance_card.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import insurance_card.model.dto.demoDTO;
import insurance_card.model.entity.nameEntity;
import insurance_card.repository.NewRepository;
import insurance_card.service.INewServices;

@RestController
public class APIdemo {
	
	@Autowired
	private INewServices NewService;
	
	@Autowired
	private NewRepository newRepository;
	
	@PostMapping(value = "/demo")
	public demoDTO createNew(@RequestBody demoDTO model) {
		return NewService.save(model);
	}
	
	
	@GetMapping(value="/demo")
	public nameEntity showNew() {
		return newRepository.getEntityByName();
	}
	
	@PutMapping(value = "/demo")
	public demoDTO updateNew(@RequestBody demoDTO model) {
		return model;
	}

}
