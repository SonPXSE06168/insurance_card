package insurance_card.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compensation")
public class CompensationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "contract_id")
	private Long contractId;

	@Column(name = "compensation_type")
	private String compensationType;

	@Column
	private String date;

	@Column
	private double price;

	@Column
	private String description;

	@Column(name = "is_resolved")
	private boolean isResolved;

	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "modified_date")
	private Date modifiedDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	public CompensationEntity() {
	}

	public CompensationEntity(Long id, Long userId, Long contractId, String compensationType, String date, double price,
			String description, boolean isResolved, Date createdDate, String createdBy, Date modifiedDate,
			String modifiedBy) {
		this.id = id;
		this.userId = userId;
		this.contractId = contractId;
		this.compensationType = compensationType;
		this.date = date;
		this.price = price;
		this.description = description;
		this.isResolved = isResolved;
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getContractId() {
		return contractId;
	}

	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}

	public String getCompensationType() {
		return compensationType;
	}

	public void setCompensationType(String compensationType) {
		this.compensationType = compensationType;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isResolved() {
		return isResolved;
	}

	public void setResolved(boolean isResolved) {
		this.isResolved = isResolved;
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
