public class SmartRobot extends Robot {
    private int stepsCount;

    public SmartRobot() {
        stepsCount = 0;
    }

    @Override
    public void moveRight() {
        super.moveRight();
        stepsCount++;
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
        stepsCount++;
    }

    @Override
    public void moveUp() {
        super.moveUp();
        stepsCount++;
    }

    @Override
    public void moveDown() {
        super.moveDown();
        stepsCount++;
    }

    public int getStepsCount() {
        return stepsCount;

    }
}