package insurance_card.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@MappedSuperclass
@Entity
@Table(name = "account")
public class AccountEntity extends ExtendsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "username")
	private String userName;

	@Column
	private String password;

	@Column(name = "is_locked")
	private boolean isLocked;

	@Column(name = "is_actived")
	private boolean isActived;

	public AccountEntity() {
	}

	public AccountEntity(long id, String userName, String password, boolean isLocked, boolean isActived) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.isLocked = isLocked;
		this.isActived = isActived;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isLocked() {
		return isLocked;
	}

	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public boolean isActived() {
		return isActived;
	}

	public void setActived(boolean isActived) {
		this.isActived = isActived;
	}

}
