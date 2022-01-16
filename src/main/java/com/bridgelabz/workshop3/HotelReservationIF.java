package com.bridgelabz.workshop3;
import java.time.LocalDate;
import java.util.ArrayList;

public interface HotelReservationIF {

    void addHotel(String hotelName, int rating, double weekDayRate, double weekendRate, double weekdayRewardCustomerRate, double weekendRewardCustomerRate);

    int getHotelListSize();

    void printHotelList();

    ArrayList<Hotel> getHotelList();

    int noOfWeekends(LocalDate startDate, LocalDate endDate);

    String getCheapestHotel(LocalDate startDate, LocalDate endDate, String customerType);

    String getBestRatedHotel(LocalDate startDate, LocalDate endDate);
}