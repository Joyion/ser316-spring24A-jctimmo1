import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class guessTest {

    public guessTest() { }

    Game game;
    String guess1;
    String guess2;
    String guess3;

    @org.junit.Before
    public void setUp(){
        this.game = new Game();
        guess1 = "Testgame";
        guess2 = "cat";
        guess3 = "crocodile";
    }

    @Test
    public void answerLengthTest(){
        game.initGame(this.guess1, "Joe");
        assert(game.getAnswer().length() == 8);
        game.initGame(this.guess2, "Joe");
        assert(game.getAnswer().length() == 3);
    }


    @Test
    public void correctGuessTest() {
        int correctPoints = 0;
        game.initGame(this.guess1, "Joe");
        double points = game.makeGuess(this.guess2);
        assert(points == correctPoints);
        String g = game.guesses.get(0);
        assert(g.equalsIgnoreCase(this.guess2));
    }

    @Test
    public void wordLenghtTest(){
        double correctLengthPoints = 2;
        double tooShortPoints = 2.2;
        double tooLongPoints = 2.1;
        // same length but, no matching characters in answer
        String samelengthGuess = "zzzzyyyy";
        String samelengthGuess2 = "zoy";
        String samelengthGuess3 = "Bollooons";
        game.initGame(this.guess1, "Joe");
        double points1 = game.makeGuess(samelengthGuess);
        assert(points1 == correctLengthPoints);

        game.initGame(this.guess1, "Joe");
        double points2 = game.makeGuess(samelengthGuess2);
        assert(points2 == tooShortPoints);

        game.initGame(this.guess1, "Joe");
        double points3 = game.makeGuess(samelengthGuess3);
        assert(points3 == tooLongPoints);

    }


    @Test
    public void letterIsInTheWordTest() {
        double correctPoints = 1.02;
        String letter = "e";
        game.initGame(this.guess1, "Joe");
        double points = game.makeGuess(letter);
      //  System.out.println(points);
        assert(points == correctPoints);
    }

}
