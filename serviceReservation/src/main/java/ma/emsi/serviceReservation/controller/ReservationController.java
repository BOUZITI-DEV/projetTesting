package ma.emsi.serviceReservation.controller;

import ma.emsi.serviceReservation.model.Reservation;
import ma.emsi.serviceReservation.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/reservation")
public class ReservationController {
    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping("find/{id}")
    public Reservation findById(@PathVariable(required = true)String id) {
        return reservationRepository.findById(Integer.parseInt(id));
    }

    @GetMapping("findAll")
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    @PostMapping("save")
    public void save(@RequestBody Reservation reservation) {
        reservationRepository.save(reservation);
    }

    @PutMapping("patch")
    public void patch(@RequestBody Reservation reservation) {
        reservationRepository.save(reservation);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable(required = true) String id) {
        reservationRepository.delete(reservationRepository.findById(Integer.parseInt(id)));
    }

    @DeleteMapping("deleteAll")
    public void deleteAll() {
        reservationRepository.deleteAll();
    }

    @GetMapping("count")
    public long count() {
        return reservationRepository.count();
    }
}
