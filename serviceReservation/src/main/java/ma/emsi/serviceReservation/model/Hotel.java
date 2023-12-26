package ma.emsi.serviceReservation.model;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {
    private int id;
    private String nom;
    private String adresse;
    @ManyToOne
    private Ville ville;
}
