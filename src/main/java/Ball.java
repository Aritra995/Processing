import processing.core.PApplet;

public class Ball implements Shape {

    private PApplet processingObject;
    private int index;
    private int diameter = Constants.DIAMETER;
    private int xCoordinate;
    private static int height = Constants.HEIGHT;
    private double speedMultiplier = Constants.speedMultiplier;


    public Ball(PApplet processingObject, int index) {
        this.processingObject = processingObject;
        this.index = index;
        this.xCoordinate = Constants.xCoordinate;
    }

    public Ball(int index, int diameter) {
        this.index = index;
        this.diameter = diameter;
    }

    @Override
    public void drawShape() {
        try{
            processingObject.ellipse((float) (index * speedMultiplier * xCoordinate), index * height/5, diameter, diameter);
            moveForward();
        } catch (NullPointerException nullPointerException){
            nullPointerException.printStackTrace();
        }
    }

    private void moveForward() {
        this.xCoordinate += 1;
    }
}
