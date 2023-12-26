package ma.emsi.serviceReservation.model;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String password;
}
