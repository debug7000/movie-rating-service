package com.microservice.rating.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.rating.model.Rating;
import com.microservice.rating.model.UserRating;

@RestController
@RequestMapping("/ratings")
public class MovieRatingController {
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId")String movieId) {
		
		return new Rating(movieId, 5);
		
	}
	
	@RequestMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable("userId")String userId)
	{
		List<Rating> ratings = Arrays.asList(
				new Rating("123",4),
				new Rating("124",5)
				);
		
		UserRating usrRating = new UserRating();
		usrRating.setRatings(ratings);
		return usrRating;
	}

}
