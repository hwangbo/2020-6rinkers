package com.cocktailpick.back.tag.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.cocktailpick.back.tag.domain.Tag;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class TagResponse {
	private String name;

	private static TagResponse of(Tag tag) {
		return new TagResponse(tag.getName());
	}

	public static List<TagResponse> listOf(List<Tag> tags) {
		return tags.stream()
			.map(TagResponse::of)
			.collect(Collectors.toList());
	}
}
