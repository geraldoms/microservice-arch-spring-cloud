package com.example.ratingapp.service;

import com.example.ratingapp.model.Rating;
import com.example.ratingapp.utils.RatingStub;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {

    public List<Rating> findAll() {

        return RatingStub.findAll();
    }

    public List<Rating> findRatingsByBookId(Long bookId) {

        return RatingStub.findRatingsByBookId(bookId);
    }

    public Rating findOne(Long id) {

        return RatingStub.findOne(id);
    }

    public Rating create(Rating rating) {

        return RatingStub.create(rating);
    }

    public Rating update(Long id, Rating rating) {

        return RatingStub.update(id, rating);
    }

    public void delete(Long id) {

        RatingStub.delete(id);
    }
}
