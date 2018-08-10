package com.example.ratingapp.model;

public class Rating {

    private Long id;
    private Long bookId;
    private float stars;
    private String comment;

    public Rating() {}

    public Rating(Long id, Long bookId, float stars, String comment) {

        this.id = id;
        this.bookId = bookId;
        this.stars = stars;
        this.comment = comment;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public Long getBookId() {

        return bookId;
    }

    public void setBookId(Long bookId) {

        this.bookId = bookId;
    }

    public float getStars() {

        return stars;
    }

    public void setStars(float stars) {

        this.stars = stars;
    }

    public String getComment() {

        return comment;
    }

    public void setComment(String comment) {

        this.comment = comment;
    }
}
