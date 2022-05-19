package insurance_card.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "punishment")
public class PunishmentEntiry extends ExtendsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "punishment_type")
	private String punishmentType;

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

	@Column(name = "resolved_punishment_description")
	private String resolvedPunishmentDescription;

	public PunishmentEntiry() {

	}

	public PunishmentEntiry(Long id, String punishmentType, Long accountId, Long contractId, String date, double price,
			String description, boolean isResolved, String resolvedPunishmentDescription) {
		this.id = id;
		this.punishmentType = punishmentType;
		this.accountId = accountId;
		this.contractId = contractId;
		this.date = date;
		this.price = price;
		this.description = description;
		this.isResolved = isResolved;
		this.resolvedPunishmentDescription = resolvedPunishmentDescription;
	}

	public boolean isResolved() {
		return isResolved;
	}

	public void setResolved(boolean isResolved) {
		this.isResolved = isResolved;
	}

	public String getResolvedPunishmentDescription() {
		return resolvedPunishmentDescription;
	}

	public void setResolvedPunishmentDescription(String resolvedPunishmentDescription) {
		this.resolvedPunishmentDescription = resolvedPunishmentDescription;
	}

	public Long getContractId() {
		return contractId;
	}

	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPunishmentType() {
		return punishmentType;
	}

	public void setPunishmentType(String punishmentType) {
		this.punishmentType = punishmentType;
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
