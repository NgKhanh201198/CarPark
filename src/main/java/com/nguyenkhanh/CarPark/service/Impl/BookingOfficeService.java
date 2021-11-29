package com.nguyenkhanh.CarPark.service.Impl;

import com.nguyenkhanh.CarPark.Repository.IBookingOfficeRepository;
import com.nguyenkhanh.CarPark.dto.BookingOfficeDTO;
import com.nguyenkhanh.CarPark.entity.BookingOfficeEntity;
import com.nguyenkhanh.CarPark.service.IBookingOfficeService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingOfficeService implements IBookingOfficeService {
//    @Autowired
//    private IBookingOfficeRepository bookingOfficeRepository;
//
//    @Autowired
//    private ModelMapper modelMapper;

    private final IBookingOfficeRepository bookingOfficeRepository;
    private final ModelMapper modelMapper;

    public BookingOfficeService(IBookingOfficeRepository bookingOfficeRepository, ModelMapper modelMapper) {
        this.bookingOfficeRepository = bookingOfficeRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void addBookingOffice(BookingOfficeDTO bookingOfficeDTO) {
        BookingOfficeEntity bookingOfficeEntity = modelMapper.map(bookingOfficeDTO, BookingOfficeEntity.class);
        bookingOfficeRepository.save(bookingOfficeEntity);
    }

    @Override
    public List<BookingOfficeDTO> listBookingOffice() {
        List<BookingOfficeEntity> listBookingOffice = bookingOfficeRepository.findAll(Sort.by(Sort.Direction.ASC, "officeId"));
        List<BookingOfficeDTO> listBookingDTO = listBookingOffice.stream().map(bookingOfficeEntity -> modelMapper.map(bookingOfficeEntity, BookingOfficeDTO.class)).collect(Collectors.toList());
        return listBookingDTO;
    }
}
