import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;


public class GivenWhiteBox {
    Game game;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void startGame() {
        Game game = new Game("lion", "Dr. M");
        assertEquals(10, game.getPoints());
    }

    // Test Case 2
    @Test
    public void countCorrectLetters_WithOneCorrectChar_Test() {
        game = new Game("James", "James");
        game.makeGuess("a");
        int c = game.countCorrectLetters();
        assert(c == 1);
    }

    // Test Case 3
    @Test
    public void noCorrectLetters_withNoCorrectChar_Test() {
        game = new Game("James", "James");
        game.makeGuess("a");
        int c = game.countCorrectLetters();
        assert(c == 0);
    }

    // Test Case 1 and 4
    @Test
    public void noCorrectLetters_withManyCorrectChar_Test() {
        game = new Game("Babboon", "James");
        game.makeGuess("b");
        game.makeGuess("c");
        int c = game.countCorrectLetters();
        assert(c == 2);
    }


}
