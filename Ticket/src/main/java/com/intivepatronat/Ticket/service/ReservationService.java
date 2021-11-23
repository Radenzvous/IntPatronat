package com.intivepatronat.Ticket.service;

import com.intivepatronat.Ticket.dto.ReservationDTO;
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
    public ReservationDTO createReservation (final ReservationDTO reservationDTO){

        Optional <User> user = userRepository.findByName(reservationDTO.getUserName());
        if (user.isEmpty()){
            User newUser = new User(reservationDTO.getUserName());
            userRepository.save(newUser);}
        else { 

        }












    return reservationDTO;


    }










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
