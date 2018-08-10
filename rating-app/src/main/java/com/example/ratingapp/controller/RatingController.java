package com.example.ratingapp.controller;

import com.example.ratingapp.model.Rating;
import com.example.ratingapp.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @GetMapping
    public List<Rating> findAllByBookId(@RequestParam(name = "bookId", required = false, defaultValue = "0") Long bookId) {

        if (bookId.equals(0L)) {
            return ratingService.findAll();
        }
        return ratingService.findRatingsByBookId(bookId);
    }

    @GetMapping("/{id}")
    public Rating findAll(@PathVariable Long id) {

        return ratingService.findOne(id);
    }

    @PostMapping
    public Rating create(@RequestBody Rating rating) {

        return ratingService.create(rating);
    }

    @PutMapping("/{id}")
    public Rating update(@PathVariable Long id, @RequestBody Rating rating) {

        return ratingService.update(id, rating);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id) {

        ratingService.delete(id);
    }
}
