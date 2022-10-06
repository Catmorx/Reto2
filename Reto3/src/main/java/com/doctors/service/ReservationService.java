package com.doctors.service;

import com.doctors.model.ReservationModel;
import com.doctors.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<ReservationModel> getAllReservations() {
        return (List<ReservationModel>) reservationRepository.getAllReservations();
    }

    public Optional<ReservationModel> getReservation(Integer idReservation) {
        return reservationRepository.getReservation(idReservation);
    }

    public ReservationModel saveReservation(ReservationModel reservationModel) {
        return reservationRepository.saveReservation(reservationModel);
    }

    public boolean deleteReservation(Integer idReservation) {
        reservationRepository.deleteReservation(idReservation);
        return true;
    }

    public ReservationModel updateReservation(ReservationModel reservationModel) {
        return reservationRepository.updateReservation(reservationModel);
    }
}
