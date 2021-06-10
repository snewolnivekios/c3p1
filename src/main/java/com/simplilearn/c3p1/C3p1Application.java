package com.simplilearn.c3p1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class C3p1Application {

	public static void main(String[] args) {
		SpringApplication.run(C3p1Application.class, args);
	}

	/**
	 * Return the number of words in the given string.
	 * @param string
	 * @return The number of words in the string, where words are delineated by a space, comma, or period.
	 */
	public int getWordCount(String string) {
		String words[] = string.toLowerCase().split("([,.\\s]+)");
		return words.length;
	}
}
