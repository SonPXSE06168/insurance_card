package insurance_card.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accident_detail")
public class AccidentDetailEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "accident_id")
	private Long accidentId;

	@Column(name = "information")
	private String information;

	@Column(name = "accident_image_id")
	private Long accidentImageId;

	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "modified_date")
	private Date modifiedDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	public AccidentDetailEntity() {
	}

	public AccidentDetailEntity(Long id, Long accidentId, String information, Long accidentImageId, Date createdDate,
			String createdBy, Date modifiedDate, String modifiedBy) {
		this.id = id;
		this.accidentId = accidentId;
		this.information = information;
		this.accidentImageId = accidentImageId;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
		this.modifiedBy = modifiedBy;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAccidentId() {
		return accidentId;
	}

	public void setAccidentId(Long accidentId) {
		this.accidentId = accidentId;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public Long getAccidentImageId() {
		return accidentImageId;
	}

	public void setAccidentImageId(Long accidentImageId) {
		this.accidentImageId = accidentImageId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

}
