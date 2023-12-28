package ma.emsi.serviceReservation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Transient
	@ManyToOne
	private User user;
	private int userId;
	@Transient
	@ManyToOne
	private Chambre chambre;
	@Column(unique = true)
	private int chambreId;

	public Reservation() {
		super();
	}

	public Reservation(int id, User user, int userId, Chambre chambre, int chambreId) {
		super();
		this.id = id;
		this.user = user;
		this.userId = userId;
		this.chambre = chambre;
		this.chambreId = chambreId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Chambre getChambre() {
		return chambre;
	}

	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}

	public int getChambreId() {
		return chambreId;
	}

	public void setChambreId(int chambreId) {
		this.chambreId = chambreId;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", user=" + user + ", userId=" + userId + ", chambre=" + chambre
				+ ", chambreId=" + chambreId + "]";
	}

}
