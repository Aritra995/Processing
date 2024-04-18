import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static final int DIAMETER = 10;
    public static final int numberOfBalls = 4;
    public static final int startBallIndex = 1;
    int x = 0;
    double speedMultiplier = 1.0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void draw() {
        drawFourBallsWithVariableSpeed();
    }

    private void drawFourBallsWithVariableSpeed() {
        for (int ballIndex = startBallIndex; ballIndex <= numberOfBalls; ballIndex++) {
            drawCircle(ballIndex);
        }
    }

    private void drawCircle(int ballIndex) {
        ellipse((float) (ballIndex *speedMultiplier*x), ballIndex *HEIGHT/5, DIAMETER, DIAMETER);
        x++;
    }

    private void drawCircle() {
        ellipse(x, mouseY, DIAMETER, DIAMETER);
        x++;
    }

    private void paintWhite() {
        background(255);
    }
}
