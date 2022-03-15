import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 700;
    public static final int HEIGHT = 500;
    public static final int WHITE = 255;
    public static final int DIAMETER = 15;
    public static final int Y_AXIS_FOUR = 400;
    public static final int Y_AXIS_THREE = 300;
    public static final int Y_AXIS_TWO = 200;
    public static final int Y_AXIS_ONE = 100;

    public static float xAxisOne = 0;
    public static float xAxisTwo= 0;
    public static float xAxisThree = 0;
    public static float xAxisFour = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawCircleOne();
        drawCircleTwo();
        drawCircleThree();
        drawCircleFour();
    }

    private void drawCircleOne() {
        ellipse(xAxisOne, Y_AXIS_ONE, DIAMETER, DIAMETER);
        xAxisOne++;
    }

    private void drawCircleTwo() {
        ellipse(xAxisTwo, Y_AXIS_TWO, DIAMETER, DIAMETER);
        xAxisTwo+=2;
    }
    private void drawCircleThree() {
        ellipse(xAxisThree, Y_AXIS_THREE, DIAMETER, DIAMETER);
        xAxisThree+=3;
    }
    private void drawCircleFour() {
        ellipse(xAxisFour, Y_AXIS_FOUR, DIAMETER, DIAMETER);
        xAxisFour+=4;
    }

    private void paintWhite() {
        background(WHITE);
    }
}
