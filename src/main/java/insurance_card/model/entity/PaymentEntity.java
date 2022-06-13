package insurance_card.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class PaymentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "contract_id")
	private Long contractId;

	@Column(name = "accident_id")
	private Long accidentId;

	@Column(name = "compensation_id")
	private Long compensationId;

	@Column(name = "punishment_id")
	private Long punishmentId;

	@Column(name = "payment_type")
	private String paymentType;

	@Column
	private double price;

	@Column
	private String date;

	@Column
	private String description;

	@Column(name = "is_paid")
	private boolean isPaid;

	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "modified_date")
	private Date modifiedDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	public PaymentEntity() {
	}

	public PaymentEntity(Long id, Long userId, Long contractId, Long accidentId, Long compensationId, Long punishmentId,
			String paymentType, double price, String date, String description, boolean isPaid, Date createdDate,
			String createdBy, Date modifiedDate, String modifiedBy) {
		this.id = id;
		this.userId = userId;
		this.contractId = contractId;
		this.accidentId = accidentId;
		this.compensationId = compensationId;
		this.punishmentId = punishmentId;
		this.paymentType = paymentType;
		this.price = price;
		this.date = date;
		this.description = description;
		this.isPaid = isPaid;
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

	public Long getAccidentId() {
		return accidentId;
	}

	public void setAccidentId(Long accidentId) {
		this.accidentId = accidentId;
	}

	public Long getCompensationId() {
		return compensationId;
	}

	public void setCompensationId(Long compensationId) {
		this.compensationId = compensationId;
	}

	public Long getPunishmentId() {
		return punishmentId;
	}

	public void setPunishmentId(Long punishmentId) {
		this.punishmentId = punishmentId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
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
