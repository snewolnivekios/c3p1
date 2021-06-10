package com.simplilearn.c3p1;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class C3p1ApplicationTests {
	
	private C3p1Application app = new C3p1Application();

	@Test
	void testWordCount() {
		assertEquals(7, app.getWordCount("Train to win in... the digital economy"));
	}

}
