package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RockPaperScissorsTest {

	
	
	@Test
	void CP1() {
		assertEquals("It's a tie!", RockPaperScissors.checkGame("Rock","Rock"));
	}
	
	@Test
	void CP2() {
		assertEquals("You win this round!", RockPaperScissors.checkGame("Rock","Scissors"));
	}
	
	@Test
	void CP3() {
		assertEquals("You win this round!", RockPaperScissors.checkGame("Paper","Rock"));
	}
	
	@Test
	void CP5() {
		assertEquals("Computer wins this round!", RockPaperScissors.checkGame("Rock","Paper"));
	}
	

}
