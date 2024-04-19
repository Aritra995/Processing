import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static final int START_BALL_INDEX = Constants.startBallIndex;
    private Shape[] balls;
    private int numberOfBalls = Constants.numberOfBalls;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(Constants.WIDTH, Constants.HEIGHT);
    }

    @Override
    public void setup() {
        balls = new Ball[numberOfBalls];
        initializeFourBalls();
    }

    private void initializeFourBalls() {
        for (int index = 0; index < numberOfBalls; index++){
            balls[index] = new Ball(this,index+START_BALL_INDEX);
        }
    }

    @Override
    public void draw() {

        for (Shape ball:balls){
            ball.drawShape();
        }
    }
}
