package insurance_card.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compensation")
public class CompensationEntity extends ExtendsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "compensation_type")
	private String compensationType;

	@Column(name = "account_id")
	private Long accountId;

	@Column(name = "contract_id")
	private Long contractId;

	@Column
	private String date;

	@Column
	private double price;

	@Column
	private String description;

	@Column(name = "is_resolved")
	private boolean isResolved;

	@Column(name = "resolved_compensation_description")
	private String resolvedCompensationDescription;

	public CompensationEntity() {
	}

	public CompensationEntity(Long id, String compensationType, Long accountId, Long contractId, String date,
			double price, String description, boolean isResolved, String resolvedCompensationDescription) {
		this.id = id;
		this.compensationType = compensationType;
		this.accountId = accountId;
		this.contractId = contractId;
		this.date = date;
		this.price = price;
		this.description = description;
		this.isResolved = isResolved;
		this.resolvedCompensationDescription = resolvedCompensationDescription;
	}

	public boolean isResolved() {
		return isResolved;
	}

	public void setResolved(boolean isResolved) {
		this.isResolved = isResolved;
	}

	public String getResolvedCompensationDescription() {
		return resolvedCompensationDescription;
	}

	public void setResolvedCompensationDescription(String resolvedCompensationDescription) {
		this.resolvedCompensationDescription = resolvedCompensationDescription;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompensationType() {
		return compensationType;
	}

	public void setCompensationType(String compensationType) {
		this.compensationType = compensationType;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getContractId() {
		return contractId;
	}

	public void setContractId(Long contractId) {
		this.contractId = contractId;
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

}
