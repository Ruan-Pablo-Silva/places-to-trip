package com.workBack.demo.projectStructure.place.PlaceService;

import com.workBack.demo.projectStructure.place.PlaceRepository;
import com.workBack.demo.projectStructure.place.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlaceServiceImpl implements PlaceService {

    @Autowired
    private PlaceRepository placeRepository;

    @Override
    public Place savePlace(Place place) {
        return placeRepository.save(place);
    }

    @Override
    public List<Place> getAllPlaces() {
        return placeRepository.findAll();
    }

    @Override
    public Optional<Place> getPlaceById(Long id) {
        return placeRepository.findById(id);
    }

    @Override
    public Place updatePlace(Long id, Place place) {
        Optional<Place> existingPlace = placeRepository.findById(id);
        if (existingPlace.isPresent()) {
            Place updatedPlace = existingPlace.get();
            updatedPlace.setName(place.getName());
            updatedPlace.setLocation(place.getLocation());
            updatedPlace.setDescription(place.getDescription());
            return placeRepository.save(updatedPlace);
        }
        return null;
    }

    @Override
    public void deletePlace(Long id) {
        placeRepository.deleteById(id);
    }
}
