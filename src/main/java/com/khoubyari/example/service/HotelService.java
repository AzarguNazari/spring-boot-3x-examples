package com.khoubyari.example.service;

import com.khoubyari.example.dao.jpa.HotelRepository;
import com.khoubyari.example.domain.Hotel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/*
 * Sample service to demonstrate what the API would use to get things done
 */
@Service
public class HotelService {

    private static final Logger log = LoggerFactory.getLogger(HotelService.class);

    @Autowired
    private HotelRepository hotelRepository;

    public HotelService() {
    }

    public Page<Hotel> getAllHotels(int page, int size){
        Pageable pageable = PageRequest.of(page, size, Sort.by(Sort.Order.asc("name")));
        return hotelRepository.findAll(pageable);
    }

    public Hotel getHotel(long id){
        return hotelRepository.findById(id).orElse(null);
    }

    public Hotel createHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    public void updateHotel(Hotel hotel) {
        hotelRepository.save(hotel);
    }

    public void deleteHotel(Long id) {
        hotelRepository.deleteById(id);
    }
}
