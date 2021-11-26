package com.intivepatronat.Ticket.service;

import com.intivepatronat.Ticket.dto.ReservationDTO;
import com.intivepatronat.Ticket.model.ParkingSpace;
import com.intivepatronat.Ticket.model.Reservation;
import com.intivepatronat.Ticket.model.User;
import com.intivepatronat.Ticket.repository.ParkingSpaceRepository;
import com.intivepatronat.Ticket.repository.ReservationRepository;
import com.intivepatronat.Ticket.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final UserRepository userRepository;
    private final ParkingSpaceRepository parkingSpaceRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository, UserRepository userRepository, ParkingSpaceRepository parkingSpaceRepository) {
        this.reservationRepository = reservationRepository;
        this.userRepository = userRepository;
        this.parkingSpaceRepository = parkingSpaceRepository;
    }

    public ReservationDTO createReservation(final ReservationDTO reservationDTO) {

        User user = userRepository.findByName(reservationDTO.getUserName()).orElseGet(() ->

        {
            User newUser = new User(reservationDTO.getUserName());
            userRepository.save(newUser);
            return newUser;
        });


//        if (user.isEmpty()) {
//            User newUser = new User(reservationDTO.getUserName());
//            userRepository.save(newUser);
//        } else {
//
//        }
        ParkingSpace parkingSpaceNumber = parkingSpaceRepository.findByNumber(reservationDTO.getParkingSpaceNumber()).orElseGet(()
                ->
        {
            ParkingSpace newParkingSpace = new ParkingSpace(reservationDTO.getParkingSpaceNumber(), reservationDTO.getParkingSpaceLevel(), reservationDTO.getParkingSpaceImpaired());
            parkingSpaceRepository.save(newParkingSpace);
            return newParkingSpace;
        });


//        if (parkingSpaceNumber.isEmpty()) {
//            ParkingSpace newParkingSpace = new ParkingSpace(reservationDTO.getParkingSpaceNumber(), reservationDTO.getParkingSpaceLevel(), reservationDTO.getParkingSpaceImpaired());
//            parkingSpaceRepository.save(newParkingSpace);
//        }
//
//        else{
// tutaj powinien byc blad bo parkingspace jest zajety
//        }

        Reservation newReservation = new Reservation(user.getId(), parkingSpaceNumber.getId());
        reservationRepository.save(newReservation);


        //


        return reservationDTO;


//    private User createUser(final UserRegistrationRequestDTO userRegistrationRequestDTO) {
//        final var userToSave = User.builder()
//                .role(getRoleByName(UserRole.CANDIDATE))
//                .status(getStatusByName(UserStatus.ACTIVE))
//                .gender(getGenderByName(userRegistrationRequestDTO.getGender()))
//                .technologyGroups(technologyGroupService.getTechnologyGroupsEntitiesByList(
//                        Optional.ofNullable(userRegistrationRequestDTO.getGroups()).orElse(null)))
//                .build();
//        return userMapper.toUserRegistrationEntity(userToSave, userRegistrationRequestDTO);
//    }
    }
}
