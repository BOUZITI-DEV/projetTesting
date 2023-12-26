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
}
