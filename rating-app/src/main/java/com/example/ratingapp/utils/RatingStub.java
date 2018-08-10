package com.example.ratingapp.utils;

import com.example.ratingapp.model.Rating;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RatingStub {

    private static Map<Long, Rating> ratings = new HashMap<>();
    private static Long counter;

    static {
        ratings.put(1L, new Rating(1L, 1L, 4.5f, "Great book with many interesting tips"));
        ratings.put(2L, new Rating(2L, 1L, 4.0f, "Really useful book"));
        ratings.put(3L, new Rating(3L, 2L, 3.0f, "Nice book"));
        ratings.put(4L, new Rating(4L, 2L, 5.0f, "Great book"));
        ratings.put(5L, new Rating(5L, 3L, 2.0f, "A little difficult to understand\n"));
        counter = 5L;
    }

    public static List<Rating> findAll() {

        return new ArrayList<>(ratings.values());
    }

    public static List<Rating> findRatingsByBookId(Long bookId) {

        return ratings.values()
                      .stream()
                      .filter(r -> r.getBookId()
                                    .equals(bookId))
                      .collect(Collectors.toList());
    }

    public static Rating findOne(Long id) {

        return ratings.get(id);
    }

    public static Rating create(Rating rating) {

        counter++;
        rating.setId(counter);
        ratings.put(counter, rating);
        return rating;
    }

    public static Rating update(Long id, Rating rating) {

        ratings.put(id, rating);
        return rating;
    }

    public static void delete(long id) {

        ratings.remove(id);
    }
}
