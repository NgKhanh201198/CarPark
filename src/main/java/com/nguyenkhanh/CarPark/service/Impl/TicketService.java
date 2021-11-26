package com.nguyenkhanh.CarPark.service.Impl;

import com.nguyenkhanh.CarPark.Repository.ITicketRepository;
import com.nguyenkhanh.CarPark.dto.TicketDTO;
import com.nguyenkhanh.CarPark.entity.TicketEntity;
import com.nguyenkhanh.CarPark.service.ITicketService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TicketService implements ITicketService {
    @Autowired
    private ITicketRepository ticketRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void addTicket(TicketDTO ticketDTO) {
        TicketEntity ticketEntity = modelMapper.map(ticketDTO, TicketEntity.class);
        ticketRepository.save(ticketEntity);
    }

    @Override
    public List<TicketDTO> listCar() {
        List<TicketEntity> listTicketEntity = ticketRepository.findAll(Sort.by(Sort.Direction.ASC, "ticketId"));
        List<TicketDTO> listTicketDTO = listTicketEntity.stream().map(ticketEntity -> modelMapper.map(ticketEntity, TicketDTO.class)).collect(Collectors.toList());
        return listTicketDTO;
    }

    @Override
    public void deleteTicket(long id) {
        ticketRepository.deleteById(id);
    }
}
