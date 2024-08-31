package com.workBack.demo.projectStructure.place.PlaceService;

import com.workBack.demo.projectStructure.place.Place;

import java.util.List;
import java.util.Optional;


public interface PlaceService {
    Place savePlace(Place place);

    List<Place> getAllPlaces();

    Optional<Place> getPlaceById(Long id);

    Place updatePlace(Long id, Place place);

    void deletePlace(Long id);
}
