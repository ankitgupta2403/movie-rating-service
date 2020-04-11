package io.spring.movieratingservice.resources;

import io.spring.movieratingservice.models.Rating;
import io.spring.movieratingservice.models.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingService")
public class MovieRating {

    @GetMapping("/users/{userId}")
    public UserRating getMovies(@PathVariable("userId") String userId)
    {
       List<Rating> ratings =  Arrays.asList(
                new Rating("1234",6),
                new Rating("5678",4)
        );

       UserRating userRating = new UserRating();
       userRating.setUserRating(ratings);
       return userRating;
    }

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId)
    {
        return new Rating("1234",8);
    }
}
