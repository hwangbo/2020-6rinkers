package com.cocktailpick.back.cocktail.dto;

import com.cocktailpick.back.cocktail.domain.UserPreferenceAnswer;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class TagPreferenceAnswer {
	private Long tagId;

	private UserPreferenceAnswer userPreferenceAnswer;
}