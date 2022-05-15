package insurance_card.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import insurance_card.model.entity.nameEntity;

public interface NewRepository extends JpaRepository<nameEntity, Long> {
	nameEntity findByName(String name);

	//@Query(value= "select * from newdemo.name where name='Son V1'", nativeQuery=true)
	@Query(value = "select e from nameEntity e where e.name='Son V1'")
	public nameEntity getEntityByName();
}
