package com.api.parkingcontrol.dtos;



import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ParkingSpotDto {

    @NotBlank
    @Getter
    @Setter
    private String parkingSpotNumber;
    @NotBlank
    @Size(max = 7)
    @Getter
    @Setter
    private String licensePlateCar;
    @NotBlank
    @Getter
    @Setter
    private String brandCar;
    @NotBlank
    @Getter
    @Setter
    private String modelCar;
    @NotBlank
    @Getter
    @Setter
    private String colorCar;
    @NotBlank
    @Getter
    @Setter
    private String responsibleName;
    @NotBlank
    @Getter
    @Setter
    private String apartment;
    @NotBlank
    @Getter
    @Setter
    private String block;

}
