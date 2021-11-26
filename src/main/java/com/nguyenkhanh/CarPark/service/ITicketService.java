package com.nguyenkhanh.CarPark.service;

import com.nguyenkhanh.CarPark.dto.TicketDTO;

import java.util.List;

public interface ITicketService {
    public void addTicket(TicketDTO ticketDTO);

    public List<TicketDTO> listCar();

    public void deleteTicket(long id);
}
