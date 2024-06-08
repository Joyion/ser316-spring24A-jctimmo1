import org.junit.Test;


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
    public void correctGuessTest() {
        int correctPoints = 0;
        game.initGame(this.guess1, "Joe");
        double points = game.makeGuess(this.guess1);
        assert(points == correctPoints);
    }

    @Test
    public void wordLenghtTest(){
        double correctLengthPoints = 2;
        double tooShortPoints = 2.2;
        double tooLongPoints = 2.1;
        // same length but, no matching characters in answer
        String samelengthGuess = "zzzzyyyy";
        String shortlengthGuess = "zoy";
        String longLengthGuess = "Bollooons";
        game.initGame(this.guess1, "Joe");
        double points1 = game.makeGuess(samelengthGuess);
        assert(points1 == correctLengthPoints);
        assert(game.answer.length() == samelengthGuess.length());

        game.initGame(this.guess1, "Joe");
        double points2 = game.makeGuess(shortlengthGuess);
        assert(points2 == tooShortPoints);
        assert(game.answer.length() > shortlengthGuess.length());

        game.initGame(this.guess1, "Joe");
        double points3 = game.makeGuess(longLengthGuess);
        assert(points3 == tooLongPoints);
        assert(game.getAnswer().length() < longLengthGuess.length());

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
