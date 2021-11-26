package com.nguyenkhanh.CarPark.service;

import com.nguyenkhanh.CarPark.dto.BookingOfficeDTO;

import java.util.List;

public interface IBookingOfficeService {
    public void addBookingOffice(BookingOfficeDTO bookingOfficeDTO);

    public List<BookingOfficeDTO> listBookingOffice();
}
