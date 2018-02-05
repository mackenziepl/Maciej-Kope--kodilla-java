package com.kodilla.good.patterns.challenges.Car;

public class RentalProcessor {

    private MailService informationService;
    private CarRentalService rentalService;
    private CarRentalRepository rentalRepository;

    public RentalProcessor(final MailService informationService,
                           final CarRentalService rentalService,
                           final CarRentalRepository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }

    public RentalDto process(final RentRequest rentRequest) {
        boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getFrom(),
                rentRequest.getTo());

        if(isRented) {
            informationService.inform(rentRequest.getUser());
            rentalRepository.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
            return new RentalDto(rentRequest.getUser(), true);
        } else {
            return new RentalDto(rentRequest.getUser(), false);
        }
    }
}
