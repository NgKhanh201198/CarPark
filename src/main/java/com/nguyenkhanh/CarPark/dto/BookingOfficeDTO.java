package com.nguyenkhanh.CarPark.dto;

import lombok.Data;

@Data
public class BookingOfficeDTO {
    private long officeId;
    private String endContractDeadline;
    private String officeName;
    private String officePhone;
    private String officePlace;
    private long officePrice;
    private String startContractDeadline;
    private long tripId;

    public BookingOfficeDTO() {
        super();
    }

    public BookingOfficeDTO(long officeId, String endContractDeadline, String officeName, String officePhone, String officePlace, long officePrice, String startContractDeadline, long tripId) {
        this.officeId = officeId;
        this.endContractDeadline = endContractDeadline;
        this.officeName = officeName;
        this.officePhone = officePhone;
        this.officePlace = officePlace;
        this.officePrice = officePrice;
        this.startContractDeadline = startContractDeadline;
        this.tripId = tripId;
    }
}
