package com.intivepatronat.Ticket.mapper;

import com.intivepatronat.Ticket.dto.ParkingSpaceDTO;
import com.intivepatronat.Ticket.model.ParkingSpace;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;


public class ParkingSpaceMapper {
    public List<ParkingSpaceDTO> mapToParkingSpaceDTOs(final List<ParkingSpace> parkingSpaces) {
        final var parkingSpaceDTOs = new ArrayList<ParkingSpaceDTO>();

        if (!CollectionUtils.isEmpty(parkingSpaces)) {
            parkingSpaces.forEach(parkingSpace -> {
                final ParkingSpaceDTO parkingSpaceDTO = new ParkingSpaceDTO(parkingSpace.getNumber(), parkingSpace.getLevel(), parkingSpace.isImpaired());
                parkingSpaceDTOs.add(parkingSpaceDTO);


            });
        }

        return parkingSpaceDTOs;
    }


}
