package ex;

public class Plank implements IExercise{
    @Override
    public void movement() {
        System.out.println("stay still");
    }

    @Override
    public void restPeriod() {
        System.out.println("After 2 minutes");
    }

    @Override
    public void burnCalories() {
        System.out.println("Burn!");
    }
}
