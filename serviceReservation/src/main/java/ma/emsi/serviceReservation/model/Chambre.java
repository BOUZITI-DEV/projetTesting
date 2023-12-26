package ma.emsi.serviceReservation.model;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Chambre {
    private int id;
    private String label;
    private boolean dispo;
    @ManyToOne
    private Hotel hotel;
}
